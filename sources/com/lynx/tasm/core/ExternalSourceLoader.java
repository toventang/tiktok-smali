package com.lynx.tasm.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.tasm.LynxTemplateRender;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.component.a;
import com.lynx.tasm.provider.g;
import com.lynx.tasm.provider.h;
import com.lynx.tasm.provider.i;
import com.lynx.tasm.provider.j;
import com.lynx.tasm.utils.m;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ExternalSourceLoader {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<LynxTemplateRender> f56513a;

    /* renamed from: b  reason: collision with root package name */
    public WeakReference<JSProxy> f56514b;

    /* renamed from: c  reason: collision with root package name */
    private final h f56515c;

    /* renamed from: d  reason: collision with root package name */
    private final h f56516d;

    /* renamed from: e  reason: collision with root package name */
    private final com.lynx.tasm.component.a f56517e;

    static {
        Covode.recordClassIndex(35260);
    }

    static class a implements Callable<byte[]> {

        /* renamed from: a  reason: collision with root package name */
        public byte[] f56537a;

        static {
            Covode.recordClassIndex(35267);
        }

        private a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* bridge */ /* synthetic */ byte[] call() {
            return this.f56537a;
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    private byte[] loadExternalSource(String str) {
        byte[] bArr;
        if (this.f56515c == null) {
            return null;
        }
        i iVar = new i(str);
        final a aVar = new a((byte) 0);
        final FutureTask futureTask = new FutureTask(aVar);
        this.f56515c.a(iVar, new g<byte[]>() {
            /* class com.lynx.tasm.core.ExternalSourceLoader.AnonymousClass1 */

            static {
                Covode.recordClassIndex(35261);
            }

            @Override // com.lynx.tasm.provider.g
            public final void a(j<byte[]> jVar) {
                super.a(jVar);
                if (jVar.a()) {
                    LLog.a(4, "ExternalSourceLoader", "loadExternalSource onSuccess.");
                    aVar.f56537a = (byte[]) jVar.f56825c;
                    futureTask.run();
                    return;
                }
                futureTask.run();
                ExternalSourceLoader.this.a(1701, "ExternalSourceLoader loadExternalSource request failed, error:" + jVar.f56823a);
            }
        });
        try {
            bArr = (byte[]) futureTask.get(5, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            a(1701, "ExternalSourceLoader loadExternalSource request failed, error:".concat(String.valueOf(e2)));
            bArr = null;
        }
        if (bArr != null && bArr.length != 0) {
            return bArr;
        }
        a(1701, "ExternalSourceLoader loadExternalSource failed, get null data for provider");
        return null;
    }

    public final void a(final int i2, final String str) {
        m.a(new Runnable() {
            /* class com.lynx.tasm.core.ExternalSourceLoader.AnonymousClass5 */

            static {
                Covode.recordClassIndex(35265);
            }

            public final void run() {
                LynxTemplateRender lynxTemplateRender = ExternalSourceLoader.this.f56513a.get();
                if (lynxTemplateRender != null) {
                    lynxTemplateRender.onErrorOccurred(i2, str);
                }
            }
        });
    }

    private void loadExternalSourceAsync(final String str, final int i2) {
        if (this.f56515c != null) {
            this.f56515c.a(new i(str), new g<byte[]>() {
                /* class com.lynx.tasm.core.ExternalSourceLoader.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(35262);
                }

                @Override // com.lynx.tasm.provider.g
                public final void a(j<byte[]> jVar) {
                    MethodCollector.i(14069);
                    super.a(jVar);
                    if (jVar.a()) {
                        LLog.a(4, "ExternalSourceLoader", "loadExternalSourceAsync onSuccess.");
                        byte[] bArr = (byte[]) jVar.f56825c;
                        if (bArr == null || bArr.length == 0) {
                            ExternalSourceLoader.this.a(1701, "ExternalSourceLoader loadExternalSourceAsync failed, get null data for provider");
                            MethodCollector.o(14069);
                            return;
                        }
                        JSProxy jSProxy = ExternalSourceLoader.this.f56514b.get();
                        if (jSProxy != null) {
                            String str = str;
                            int i2 = i2;
                            jSProxy.f56541d.readLock().lock();
                            if (jSProxy.f56538a != 0) {
                                JSProxy.nativeEvaluateScript(jSProxy.f56538a, str, bArr, i2);
                            }
                            jSProxy.f56541d.readLock().unlock();
                        }
                        MethodCollector.o(14069);
                        return;
                    }
                    ExternalSourceLoader.this.a(1701, "ExternalSourceLoader loadExternalSourceAsync request failed, error:" + jVar.f56823a);
                    MethodCollector.o(14069);
                }
            });
        }
    }

    private void loadDynamicComponentAsync(final String str, final int i2) {
        if (this.f56516d != null) {
            this.f56516d.a(new i(str), new g<byte[]>() {
                /* class com.lynx.tasm.core.ExternalSourceLoader.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(35263);
                }

                @Override // com.lynx.tasm.provider.g
                public final void a(j<byte[]> jVar) {
                    String str;
                    super.a(jVar);
                    ExternalSourceLoader externalSourceLoader = ExternalSourceLoader.this;
                    String str2 = str;
                    int i2 = i2;
                    byte[] bArr = (byte[]) jVar.f56825c;
                    if (jVar.f56823a != null) {
                        str = jVar.f56823a.getMessage();
                    } else {
                        str = null;
                    }
                    externalSourceLoader.a(str2, i2, bArr, str);
                }
            });
            return;
        }
        com.lynx.tasm.component.a aVar = this.f56517e;
        if (aVar != null) {
            aVar.a(str, new a.AbstractC1268a() {
                /* class com.lynx.tasm.core.ExternalSourceLoader.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(35264);
                }

                @Override // com.lynx.tasm.component.a.AbstractC1268a
                public final void a(byte[] bArr, Throwable th) {
                    String str;
                    ExternalSourceLoader externalSourceLoader = ExternalSourceLoader.this;
                    String str2 = str;
                    int i2 = i2;
                    if (th != null) {
                        str = th.getMessage();
                    } else {
                        str = null;
                    }
                    externalSourceLoader.a(str2, i2, bArr, str);
                }
            });
        } else {
            a(str, i2, null, "ExternalSourceLoader Load dynamic component failed, since there is no provider or fetcher.");
        }
    }

    public ExternalSourceLoader(h hVar, h hVar2, com.lynx.tasm.component.a aVar, LynxTemplateRender lynxTemplateRender) {
        this.f56515c = hVar;
        this.f56516d = hVar2;
        this.f56517e = aVar;
        this.f56513a = new WeakReference<>(lynxTemplateRender);
    }

    public final void a(final String str, final int i2, final byte[] bArr, String str2) {
        String str3;
        int i3;
        if (str2 != null) {
            str3 = "ExternalSourceLoader Load dynamic component failed, the url is " + str + ", and the error message is " + str2;
            i3 = 1601;
        } else if (bArr == null || bArr.length == 0) {
            str3 = "ExternalSourceLoader The dynamic component's binary template is empty, the url is ".concat(String.valueOf(str));
            i3 = 1602;
        } else {
            m.a(new Runnable() {
                /* class com.lynx.tasm.core.ExternalSourceLoader.AnonymousClass6 */

                static {
                    Covode.recordClassIndex(35266);
                }

                public final void run() {
                    LynxTemplateRender lynxTemplateRender = ExternalSourceLoader.this.f56513a.get();
                    if (lynxTemplateRender != null) {
                        lynxTemplateRender.loadComponent(str, bArr, i2);
                    }
                }
            });
            return;
        }
        a(i3, str3);
        JSProxy jSProxy = this.f56514b.get();
        if (jSProxy != null) {
            jSProxy.a(str, i2, i3, str3);
        }
    }
}
