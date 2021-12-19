package com.bytedance.geckox.settings.b;

import android.accounts.NetworkErrorException;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.GeckoGlobalConfig;
import com.bytedance.geckox.d.b;
import com.bytedance.geckox.f;
import com.bytedance.geckox.k.c;
import com.bytedance.geckox.model.Common;
import com.bytedance.geckox.model.Response;
import com.bytedance.geckox.settings.model.GlobalConfigSettings;
import com.bytedance.geckox.settings.model.SettingsRequestBody;
import com.bytedance.geckox.statistic.model.SettingsUpdateData;
import com.bytedance.geckox.utils.j;
import com.bytedance.q.d;
import java.io.IOException;
import java.util.HashMap;

public class a extends d<String, GlobalConfigSettings> {

    /* renamed from: a  reason: collision with root package name */
    private GeckoGlobalConfig f30042a;

    /* renamed from: b  reason: collision with root package name */
    private int f30043b;

    /* renamed from: j  reason: collision with root package name */
    private SettingsUpdateData f30044j = new SettingsUpdateData();

    static {
        Covode.recordClassIndex(17430);
    }

    private GlobalConfigSettings a() {
        com.bytedance.geckox.k.d dVar;
        Pair<String, String> requestTagHeader;
        String str = "https://" + this.f30042a.getHost() + "/gecko/api/settings/v1";
        this.f30044j.ac = j.a(this.f30042a.getContext());
        try {
            SettingsRequestBody settingsRequestBody = new SettingsRequestBody();
            settingsRequestBody.setCommon(new Common(this.f30042a.getAppId(), this.f30042a.getAppVersion(), this.f30042a.getDeviceId(), com.bytedance.geckox.utils.a.b(this.f30042a.getContext()), j.a(this.f30042a.getContext())));
            SettingsRequestBody.Settings settings = new SettingsRequestBody.Settings(this.f30043b, this.f30042a.getEnv().getVal());
            this.f30044j.settingsInfo = b.f29780a.f29781b.b(settings);
            settingsRequestBody.setSettings(settings);
            String b2 = b.f29780a.f29781b.b(settingsRequestBody);
            com.bytedance.geckox.i.a.a("settings request:", b2);
            c netWork = this.f30042a.getNetWork();
            GeckoGlobalConfig d2 = f.a().d();
            if (d2 == null || !(netWork instanceof com.bytedance.geckox.k.b)) {
                dVar = netWork.a(str, b2);
            } else {
                com.bytedance.geckox.k.b bVar = (com.bytedance.geckox.k.b) netWork;
                GeckoGlobalConfig.IRequestTagHeaderProvider requestTagHeaderProvider = d2.getRequestTagHeaderProvider();
                HashMap hashMap = new HashMap();
                if (!(requestTagHeaderProvider == null || (requestTagHeader = requestTagHeaderProvider.getRequestTagHeader(true)) == null)) {
                    hashMap.put(requestTagHeader.first, requestTagHeader.second);
                }
                dVar = bVar.a();
            }
            this.f30044j.httpStatus = dVar.f29923c;
            this.f30044j.logId = com.bytedance.geckox.statistic.model.a.a(dVar.f29921a);
            if (dVar.f29923c == 200) {
                String str2 = dVar.f29922b;
                com.bytedance.geckox.i.a.a("settings response:", str2);
                try {
                    Response response = (Response) b.f29780a.f29781b.a(str2, new com.google.gson.b.a<Response<GlobalConfigSettings>>() {
                        /* class com.bytedance.geckox.settings.b.a.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(17431);
                        }
                    }.type);
                    this.f30044j.errCode = response.status;
                    this.f30044j.errorMsg = response.msg;
                    com.bytedance.geckox.statistic.c.a(this.f30044j);
                    if (response.status != 0 && response.status != 1103) {
                        throw new com.bytedance.q.a.d(response.status, "request failed, url:" + str + ", code=" + response.status + ", " + response.msg);
                    } else if (response.data != null) {
                        return response.data;
                    } else {
                        throw new com.bytedance.q.a.a("get settings error,response data is null");
                    }
                } catch (Exception e2) {
                    String str3 = "json parse failed：" + str2 + " caused by:" + e2.getMessage();
                    this.f30044j.errorMsg = str3;
                    com.bytedance.geckox.statistic.c.a(this.f30044j);
                    throw new com.bytedance.q.a.b(str3, e2);
                }
            } else {
                this.f30044j.errCode = dVar.f29923c;
                this.f30044j.errorMsg = dVar.f29924d;
                throw new NetworkErrorException("net work get failed, code: " + dVar.f29923c + ", url:" + str);
            }
        } catch (IOException e3) {
            this.f30044j.errorMsg = e3.getMessage();
            com.bytedance.geckox.statistic.c.a(this.f30044j);
            throw new com.bytedance.q.a.c("request failed：url:".concat(String.valueOf(str)), e3);
        } catch (com.bytedance.q.a.c e4) {
            this.f30044j.errorMsg = e4.getMessage();
            com.bytedance.geckox.statistic.c.a(this.f30044j);
            throw e4;
        } catch (Exception e5) {
            this.f30044j.errorMsg = e5.getMessage();
            com.bytedance.geckox.statistic.c.a(this.f30044j);
            throw new com.bytedance.q.a.c("request failed：url:".concat(String.valueOf(str)), e5);
        }
    }

    @Override // com.bytedance.q.d
    public final void a(Object... objArr) {
        super.a(objArr);
        this.f30042a = (GeckoGlobalConfig) objArr[0];
        this.f30043b = ((Integer) objArr[1]).intValue();
        this.f30044j.apiVersion = "settings_v1";
        this.f30044j.aid = this.f30042a.getAppId();
        this.f30044j.appVersion = this.f30042a.getAppVersion();
        this.f30044j.deviceId = this.f30042a.getDeviceId();
        this.f30044j.region = this.f30042a.getRegion();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.q.b, java.lang.Object] */
    @Override // com.bytedance.q.d
    public final /* synthetic */ Object a(com.bytedance.q.b<GlobalConfigSettings> bVar, String str) {
        this.f30044j.reqType = ((Integer) bVar.a("req_type")).intValue();
        return a();
    }
}
