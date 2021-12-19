package com.lynx.component.svg;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.lynx.component.svg.a.e;
import com.lynx.component.svg.a.f;
import com.lynx.component.svg.a.h;
import com.lynx.component.svg.d;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.lynx.tasm.core.a;
import com.lynx.tasm.core.b;
import com.lynx.tasm.utils.k;
import com.lynx.tasm.utils.m;

public class UISvg extends LynxUI<b> {

    /* renamed from: a  reason: collision with root package name */
    public d f55197a;

    /* renamed from: b  reason: collision with root package name */
    public e f55198b;

    /* renamed from: c  reason: collision with root package name */
    public f f55199c;

    /* renamed from: d  reason: collision with root package name */
    private String f55200d;

    /* renamed from: e  reason: collision with root package name */
    private String f55201e;

    static {
        Covode.recordClassIndex(34624);
    }

    private void a() {
        m.a(new Runnable() {
            /* class com.lynx.component.svg.UISvg.AnonymousClass4 */

            static {
                Covode.recordClassIndex(34630);
            }

            public final void run() {
                if (UISvg.this.f55199c != null) {
                    ((b) UISvg.this.mView).setImageDrawable(new a(UISvg.this.f55199c, UISvg.this.f55198b, UISvg.this.f55197a));
                    UISvg.this.invalidate();
                }
            }
        });
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onDetach() {
        super.onDetach();
        for (Bitmap bitmap : this.f55197a.f55426b) {
            try {
                bitmap.recycle();
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public void onLayoutUpdated() {
        super.onLayoutUpdated();
        this.f55198b.a((float) getWidth(), (float) getHeight());
        if (this.f55199c != null) {
            a();
        }
    }

    /* Return type fixed from 'android.view.View' to match base method */
    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public /* synthetic */ b createView(Context context) {
        return new b(context);
    }

    public UISvg(j jVar) {
        super(jVar);
        this.f55198b = new e(jVar.f55901i.mFontSize);
        this.f55197a = new d(jVar);
    }

    public final void a(final f fVar) {
        m.a(new Runnable() {
            /* class com.lynx.component.svg.UISvg.AnonymousClass3 */

            static {
                Covode.recordClassIndex(34629);
            }

            public final void run() {
                UISvg.this.f55199c = fVar;
                ((b) UISvg.this.mView).setImageDrawable(new a(fVar, UISvg.this.f55198b, UISvg.this.f55197a));
                UISvg.this.invalidate();
            }
        });
    }

    @com.lynx.tasm.behavior.m(a = "content")
    public void setContent(final String str) {
        if (TextUtils.isEmpty(str)) {
            ((b) this.mView).setImageDrawable(null);
        } else if (!str.equals(this.f55201e)) {
            this.f55201e = str;
            a.a().execute(new Runnable() {
                /* class com.lynx.component.svg.UISvg.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(34628);
                }

                public final void run() {
                    try {
                        UISvg.this.a(f.a(str));
                    } catch (h e2) {
                        LLog.a(6, "lynx_UISvg", e2.toString());
                    }
                }
            });
        }
    }

    @com.lynx.tasm.behavior.m(a = "src")
    public void setSource(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f55200d = null;
            ((b) this.mView).setImageDrawable(null);
        } else if (!str.equals(this.f55200d)) {
            this.f55200d = str;
            d dVar = this.f55197a;
            AnonymousClass1 r4 = new d.c() {
                /* class com.lynx.component.svg.UISvg.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(34627);
                }

                @Override // com.lynx.component.svg.d.c
                public final void a(f fVar) {
                    UISvg.this.a(fVar);
                }

                @Override // com.lynx.component.svg.d.c
                public final void a(String str) {
                    LLog.a(6, "lynx_UISvg", str);
                }
            };
            if (dVar.f55427c == null) {
                String a2 = com.lynx.tasm.behavior.ui.image.a.a(dVar.f55425a, str);
                if (TextUtils.isEmpty(a2)) {
                    r4.a("url is empty!");
                } else if (TextUtils.isEmpty(Uri.parse(a2).getScheme())) {
                    r4.a("scheme is Empty!");
                } else {
                    b.a().a(new com.lynx.tasm.provider.e(a2), new com.lynx.tasm.provider.d(a2, r4) {
                        /* class com.lynx.component.svg.d.AnonymousClass2 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ String f55432a;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ c f55433b;

                        static {
                            Covode.recordClassIndex(34706);
                        }

                        @Override // com.lynx.tasm.provider.d
                        public final void onFailed(com.lynx.tasm.provider.f fVar) {
                            this.f55433b.a(fVar.f56818b);
                        }

                        @Override // com.lynx.tasm.provider.d
                        public final void onSuccess(com.lynx.tasm.provider.f fVar) {
                            f a2;
                            try {
                                String a3 = k.a(fVar.f56820d);
                                if (TextUtils.isEmpty(a3)) {
                                    fVar.f56818b = "data is empty!";
                                    onFailed(fVar);
                                    return;
                                }
                                if (this.f55432a.startsWith("res:///")) {
                                    Application application = LynxEnv.b().f55531a;
                                    a2 = f.a(application.getResources(), Integer.parseInt(a3));
                                } else {
                                    a2 = f.a(a3);
                                }
                                this.f55433b.a(a2);
                            } catch (h e2) {
                                fVar.f56818b = e2.toString();
                                new RuntimeException(e2);
                            }
                        }

                        {
                            this.f55432a = r2;
                            this.f55433b = r3;
                        }
                    });
                }
            } else {
                new Object(r4) {
                    /* class com.lynx.component.svg.d.AnonymousClass3 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ c f55435a;

                    static {
                        Covode.recordClassIndex(34707);
                    }

                    {
                        this.f55435a = r2;
                    }
                };
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public void updateLayout(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, Rect rect) {
        super.updateLayout(i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, rect);
        this.f55198b.a((float) getWidth(), (float) getHeight());
        if (this.f55199c != null) {
            a();
        }
    }
}
