package com.bytedance.bdturing.c;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.widget.Toast;
import com.bytedance.bdturing.m;
import com.bytedance.bdturing.twiceverify.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.utils.ic;
import com.ss.android.ugc.tiktok.security.a.a;
import org.json.JSONException;
import org.json.JSONObject;

public final class d implements a {

    /* renamed from: a  reason: collision with root package name */
    public Activity f26450a;

    static {
        Covode.recordClassIndex(15548);
    }

    public d(Activity activity) {
        this.f26450a = activity;
    }

    @Override // com.bytedance.bdturing.c.a
    public final void b(final c cVar) {
        try {
            if (cVar.f26445b != null) {
                String str = cVar.f26445b;
                char c2 = 65535;
                switch (str.hashCode()) {
                    case -433891794:
                        if (str.equals("second_verify.close")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case -431325456:
                        if (str.equals("second_verify.fetch")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case -418116003:
                        if (str.equals("second_verify.toast")) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case -268991152:
                        if (str.equals("second_verify.hideLoading")) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case 103102532:
                        if (str.equals("second_verify.isSmsAvailable")) {
                            c2 = 5;
                            break;
                        }
                        break;
                    case 239578933:
                        if (str.equals("second_verify.showLoading")) {
                            c2 = 4;
                            break;
                        }
                        break;
                    case 1807041893:
                        if (str.equals("second_verify.openSms")) {
                            c2 = 6;
                            break;
                        }
                        break;
                }
                switch (c2) {
                    case 0:
                        try {
                            final JSONObject jSONObject = new JSONObject(cVar.f26446c);
                            m.a.f26544a.a(new Runnable() {
                                /* class com.bytedance.bdturing.c.d.AnonymousClass1 */

                                static {
                                    Covode.recordClassIndex(15549);
                                }

                                /* JADX WARNING: Removed duplicated region for block: B:65:0x0140  */
                                /* JADX WARNING: Removed duplicated region for block: B:68:0x0147 A[Catch:{ Exception -> 0x01e4, all -> 0x01c5 }] */
                                /* JADX WARNING: Removed duplicated region for block: B:71:0x016a A[Catch:{ Exception -> 0x01e4, all -> 0x01c5 }] */
                                /* JADX WARNING: Removed duplicated region for block: B:73:0x017c A[Catch:{ Exception -> 0x01e4, all -> 0x01c5 }] */
                                /* JADX WARNING: Removed duplicated region for block: B:8:0x0060 A[Catch:{ Exception -> 0x013a }] */
                                /* Code decompiled incorrectly, please refer to instructions dump. */
                                public final void run() {
                                    /*
                                    // Method dump skipped, instructions count: 514
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bdturing.c.d.AnonymousClass1.run():void");
                                }
                            });
                            return;
                        } catch (Exception unused) {
                            return;
                        }
                    case 1:
                        JSONObject jSONObject2 = new JSONObject(cVar.f26446c);
                        int optInt = jSONObject2.optInt("status_code");
                        jSONObject2.optString("message");
                        c.a aVar = c.a().f26561b;
                        if (aVar != null) {
                            if (optInt == 0) {
                                aVar.a();
                            } else {
                                aVar.a(optInt);
                            }
                            Activity activity = this.f26450a;
                            if (activity != null) {
                                activity.finish();
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        c.a();
                        return;
                    case 3:
                        String optString = new JSONObject(cVar.f26446c).optString("text");
                        Activity activity2 = this.f26450a;
                        if (activity2 != null) {
                            Toast makeText = Toast.makeText(activity2, optString, 0);
                            if (Build.VERSION.SDK_INT == 25) {
                                ic.a(makeText);
                            }
                            makeText.show();
                            return;
                        }
                        return;
                    case 4:
                        new JSONObject(cVar.f26446c).optString("text");
                        if (this.f26450a != null) {
                            c.a();
                            return;
                        }
                        return;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        cVar.a(1, null);
                        return;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        JSONObject jSONObject3 = new JSONObject(cVar.f26446c);
                        String optString2 = jSONObject3.optString("phone_number");
                        String optString3 = jSONObject3.optString("sms_content");
                        if (this.f26450a != null) {
                            Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("smsto:".concat(String.valueOf(optString2))));
                            intent.putExtra("sms_body", optString3);
                            Activity activity3 = this.f26450a;
                            a.a(intent, activity3);
                            activity3.startActivity(intent);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }
}
