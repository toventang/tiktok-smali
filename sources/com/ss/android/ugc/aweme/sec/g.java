package com.ss.android.ugc.aweme.sec;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sec.d;
import okhttp3.FormBody;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONException;
import org.json.JSONObject;

public final class g implements Interceptor {
    static {
        Covode.recordClassIndex(79328);
    }

    static final class a extends f<Response> {

        /* renamed from: g  reason: collision with root package name */
        public Interceptor.Chain f121817g;

        /* renamed from: h  reason: collision with root package name */
        public Response f121818h;

        static {
            Covode.recordClassIndex(79329);
        }

        @Override // com.ss.android.ugc.aweme.sec.d.a
        public final d<Response> d() {
            return new d.a<Response>() {
                /* class com.ss.android.ugc.aweme.sec.g.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(79330);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.ss.android.ugc.aweme.sec.d.a, com.ss.android.ugc.aweme.sec.d
                public final /* bridge */ /* synthetic */ Response a() {
                    return a.this.f121818h;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.ss.android.ugc.aweme.sec.d.a, com.ss.android.ugc.aweme.sec.d
                public final /* synthetic */ Response b() {
                    a.this.f121817g.request().url();
                    Interceptor.Chain chain = a.this.f121817g;
                    Request request = chain.request();
                    String valueOf = String.valueOf(System.currentTimeMillis());
                    Request.Builder url = request.newBuilder().url(request.url());
                    FormBody formBody = (FormBody) request.body();
                    if (formBody != null && formBody.size() > 0) {
                        FormBody.Builder builder = new FormBody.Builder();
                        for (int i2 = 0; i2 < formBody.size(); i2++) {
                            if (TextUtils.equals(formBody.encodedName(i2), "_rticket")) {
                                builder.addEncoded(formBody.encodedName(i2), valueOf);
                            } else {
                                builder.addEncoded(formBody.encodedName(i2), formBody.encodedValue(i2));
                            }
                        }
                        url.method(request.method(), builder.build());
                    }
                    return chain.proceed(url.build());
                }
            };
        }

        private a(Interceptor.Chain chain, Response response) {
            this.f121817g = chain;
            this.f121818h = response;
        }

        /* synthetic */ a(Interceptor.Chain chain, Response response, byte b2) {
            this(chain, response);
        }
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        String str;
        boolean z;
        int intValue;
        Response proceed = chain.proceed(chain.request());
        String header = proceed.header("Content-Type");
        Request request = proceed.request();
        String str2 = "";
        if (request == null || request.url() == null) {
            str = str2;
        } else {
            str = request.url().toString();
        }
        if (TextUtils.isEmpty(header)) {
            return proceed;
        }
        if ((!TextUtils.isEmpty(header) && !header.contains("json")) || (!TextUtils.isEmpty(str) && (str.contains("/effect/api") || str.contains("/model/api")))) {
            return proceed;
        }
        String a2 = e.a(proceed);
        if (!TextUtils.isEmpty(a2)) {
            try {
                JSONObject jSONObject = new JSONObject(a2);
                boolean z2 = false;
                r5 = 0;
                int i2 = 0;
                z2 = false;
                a aVar = new a(chain, proceed, (byte) 0);
                String httpUrl = chain.request().url().toString();
                aVar.f121814f = jSONObject;
                if ((!jSONObject.has("status_code") || jSONObject.optInt("status_code") != 0) && (!jSONObject.has("message") || !TextUtils.equals("success", jSONObject.optString("message")))) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    if (jSONObject.has("error_code")) {
                        intValue = jSONObject.optInt("error_code");
                    } else if (jSONObject.has("status_code")) {
                        intValue = jSONObject.optInt("status_code");
                    } else if (SecApiImpl.a().isCaptchaUrl(httpUrl)) {
                        String str3 = null;
                        if (SecApiImpl.a().isCaptchaUrl(httpUrl)) {
                            if (jSONObject.has("message")) {
                                str2 = jSONObject.optString("message");
                            }
                            if (TextUtils.equals(str2, "error")) {
                                JSONObject jSONObject2 = new JSONObject(jSONObject.optString("data"));
                                i2 = jSONObject2.optInt("error_code");
                                str3 = jSONObject2.optString("verify_center_decision_conf");
                                if (TextUtils.isEmpty(str3)) {
                                    str3 = jSONObject2.optString("verify_center_secondary_decision_conf");
                                }
                            }
                        }
                        Pair create = Pair.create(Integer.valueOf(i2), str3);
                        intValue = ((Integer) create.first).intValue();
                        if (!TextUtils.isEmpty((CharSequence) create.second)) {
                            z2 = aVar.a((String) create.second);
                        }
                    }
                    z2 = aVar.a(intValue);
                }
                if (z2) {
                    return (Response) aVar.c();
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            } catch (InterruptedException e3) {
                e3.printStackTrace();
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        }
        return proceed;
    }
}
