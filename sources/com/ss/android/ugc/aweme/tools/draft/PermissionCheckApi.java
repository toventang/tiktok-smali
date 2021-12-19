package com.ss.android.ugc.aweme.tools.draft;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.z;
import com.google.gson.f;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.util.bj;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class PermissionCheckApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f139346a = new a((byte) 0);

    public interface CheckPermissionRequest {
        static {
            Covode.recordClassIndex(91091);
        }

        @h(a = "/tiktok/v1/permission/check/")
        com.bytedance.retrofit2.b<be> checkPermission(@z(a = "check_entities") b bVar);
    }

    static {
        Covode.recordClassIndex(91090);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(91092);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static be a(b bVar) {
            l.d(bVar, "");
            try {
                return ((CheckPermissionRequest) g.a().C().createRetrofit(g.a().C().getApiHost(), true, CheckPermissionRequest.class)).checkPermission(bVar).execute().f42630b;
            } catch (Exception e2) {
                StringBuilder sb = new StringBuilder("permission check failed: ");
                e2.printStackTrace();
                bj.a(sb.append(h.z.f158842a).toString());
                return null;
            }
        }
    }

    public static final class c implements Serializable {
        @com.google.gson.a.c(a = "check_type")
        private int checkType;
        @com.google.gson.a.c(a = "id")
        private String id = "";
        @com.google.gson.a.c(a = "id_type")
        private int idType;

        static {
            Covode.recordClassIndex(91094);
        }

        public final int getCheckType() {
            return this.checkType;
        }

        public final String getId() {
            return this.id;
        }

        public final int getIdType() {
            return this.idType;
        }

        public final void setCheckType(int i2) {
            this.checkType = i2;
        }

        public final void setIdType(int i2) {
            this.idType = i2;
        }

        public final void setId(String str) {
            l.d(str, "");
            this.id = str;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public List<c> f139347a;

        static {
            Covode.recordClassIndex(91093);
        }

        public final String toString() {
            String b2 = new f().b(this.f139347a);
            l.b(b2, "");
            return b2;
        }
    }
}
