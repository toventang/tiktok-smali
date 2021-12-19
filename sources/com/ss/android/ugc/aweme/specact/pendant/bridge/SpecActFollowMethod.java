package com.ss.android.ugc.aweme.specact.pendant.bridge;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.userservice.UserService;
import f.a.t;
import f.a.v;
import f.a.w;
import f.a.z;
import h.f.b.l;
import java.util.HashMap;
import org.json.JSONObject;

public final class SpecActFollowMethod extends BaseCommonJavaMethod implements au {
    static {
        Covode.recordClassIndex(87716);
    }

    private SpecActFollowMethod(byte b2) {
        this();
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    private /* synthetic */ SpecActFollowMethod() {
        this((com.bytedance.ies.web.a.a) null);
    }

    public static final class b implements z<FollowStatus> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseCommonJavaMethod.a f134111a;

        static {
            Covode.recordClassIndex(87718);
        }

        @Override // f.a.z
        public final void onComplete() {
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            l.d(th, "");
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            l.d(bVar, "");
        }

        b(BaseCommonJavaMethod.a aVar) {
            this.f134111a = aVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.z
        public final /* synthetic */ void onNext(FollowStatus followStatus) {
            FollowStatus followStatus2 = followStatus;
            l.d(followStatus2, "");
            BaseCommonJavaMethod.a aVar = this.f134111a;
            if (aVar != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", 1);
                jSONObject.put("follow_status", followStatus2.followStatus);
                aVar.a(jSONObject);
            }
        }
    }

    public SpecActFollowMethod(com.bytedance.ies.web.a.a aVar) {
        super(aVar);
    }

    static final class a<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ JSONObject f134110a;

        static {
            Covode.recordClassIndex(87717);
        }

        a(JSONObject jSONObject) {
            this.f134110a = jSONObject;
        }

        @Override // f.a.w
        public final void subscribe(v<FollowStatus> vVar) {
            String str;
            String str2;
            FollowStatus a2;
            l.d(vVar, "");
            JSONObject jSONObject = this.f134110a;
            Integer num = null;
            if (jSONObject != null) {
                str = jSONObject.optString("uid");
            } else {
                str = null;
            }
            JSONObject jSONObject2 = this.f134110a;
            if (jSONObject2 != null) {
                str2 = jSONObject2.optString("sec_uid");
            } else {
                str2 = null;
            }
            JSONObject jSONObject3 = this.f134110a;
            if (jSONObject3 != null) {
                num = Integer.valueOf(jSONObject3.optInt(StringSet.type));
            }
            if (str != null && str2 != null && num != null && (a2 = UserService.d().a(str, str2, num.intValue(), -1, -1, "", -1, "", new HashMap())) != null) {
                vVar.a(a2);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        t.a(new a(jSONObject)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b((z) new b(aVar));
    }
}
