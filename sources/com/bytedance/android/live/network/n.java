package com.bytedance.android.live.network;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.message.LiveMtPbRequestsSetting;
import com.bytedance.android.livesdkapi.model.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.client.a;
import com.bytedance.retrofit2.client.b;
import com.bytedance.retrofit2.client.d;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public final class n implements a {
    static {
        Covode.recordClassIndex(6651);
    }

    @Override // com.bytedance.retrofit2.client.a
    public final d a(final Request request) {
        return new d() {
            /* class com.bytedance.android.live.network.n.AnonymousClass1 */

            /* renamed from: c  reason: collision with root package name */
            private c<com.bytedance.android.livesdkapi.model.a> f12141c;

            static {
                Covode.recordClassIndex(6652);
            }

            @Override // com.bytedance.retrofit2.client.d
            public final boolean a(long j2) {
                return false;
            }

            @Override // com.bytedance.retrofit2.client.d
            public final void b() {
                c<com.bytedance.android.livesdkapi.model.a> cVar = this.f12141c;
                if (cVar != null) {
                    try {
                        cVar.b();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
            }

            @Override // com.bytedance.retrofit2.client.d
            public final com.bytedance.retrofit2.client.c a() {
                TypedInput typedByteArray;
                MethodCollector.i(11698);
                String method = request.getMethod();
                if ("GET".equals(method) || "POST".equals(method)) {
                    ArrayList arrayList = new ArrayList();
                    List<b> headers = request.getHeaders();
                    if (headers != null) {
                        for (b bVar : headers) {
                            if (LiveMtPbRequestsSetting.INSTANCE.getValue().isEnable() || !TextUtils.equals(bVar.f42471a, "response-format")) {
                                arrayList.add(new com.bytedance.android.live.base.model.a(bVar.f42471a, bVar.f42472b));
                            }
                        }
                    }
                    if (TextUtils.equals("GET", method)) {
                        this.f12141c = h.a().a(request.getUrl(), arrayList, request.getExtraInfo());
                    } else {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        if (request.getBody() != null) {
                            request.getBody().writeTo(byteArrayOutputStream);
                        }
                        if (request.getBody() instanceof MultipartTypedOutput) {
                            this.f12141c = h.a().a(request.getMaxLength(), request.getUrl(), arrayList, request.getBody().mimeType(), byteArrayOutputStream.toByteArray(), request.getBody().length(), request.getBody().md5Stub());
                        } else {
                            this.f12141c = h.a().a(request.getUrl(), arrayList, request.getBody().mimeType(), byteArrayOutputStream.toByteArray(), request.getExtraInfo());
                        }
                    }
                    final com.bytedance.android.livesdkapi.model.a a2 = this.f12141c.a();
                    ArrayList arrayList2 = new ArrayList();
                    if (a2.f23266c != null) {
                        for (com.bytedance.android.live.base.model.a aVar : a2.f23266c) {
                            arrayList2.add(new b(aVar.getName(), aVar.getValue()));
                        }
                    }
                    if (request.isResponseStreaming()) {
                        typedByteArray = new TypedInput() {
                            /* class com.bytedance.android.live.network.n.AnonymousClass1.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(6653);
                            }

                            @Override // com.bytedance.retrofit2.mime.TypedInput
                            public final long length() {
                                return (long) a2.f23268e.length;
                            }

                            @Override // com.bytedance.retrofit2.mime.TypedInput
                            public final String mimeType() {
                                return a2.f23267d;
                            }

                            @Override // com.bytedance.retrofit2.mime.TypedInput
                            public final InputStream in() {
                                MethodCollector.i(12403);
                                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(a2.f23268e);
                                MethodCollector.o(12403);
                                return byteArrayInputStream;
                            }
                        };
                    } else {
                        typedByteArray = new TypedByteArray(a2.f23267d, a2.f23268e, new String[0]);
                    }
                    com.bytedance.retrofit2.client.c cVar = new com.bytedance.retrofit2.client.c(a2.f23264a, a2.f23265b, a2.f23269f, arrayList2, typedByteArray);
                    MethodCollector.o(11698);
                    return cVar;
                }
                com.bytedance.android.live.core.c.a.a(6, "RetrofitProvider", "REQUEST NOT GET OR POST");
                MethodCollector.o(11698);
                return null;
            }
        };
    }
}
