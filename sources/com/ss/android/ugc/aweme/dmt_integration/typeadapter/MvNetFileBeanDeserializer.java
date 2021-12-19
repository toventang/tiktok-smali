package com.ss.android.ugc.aweme.dmt_integration.typeadapter;

import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.o;
import com.ss.android.ugc.aweme.mvtheme.MvNetFileBean;
import java.lang.reflect.Type;

public final class MvNetFileBeanDeserializer implements k<MvNetFileBean> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f82951a = new a((byte) 0);

    static {
        Covode.recordClassIndex(51713);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(51714);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private static MvNetFileBean a(l lVar) {
        if (lVar == null) {
            return null;
        }
        try {
            o j2 = lVar.j();
            h.f.b.l.b(j2, "");
            a.b(j2, "photo_path");
            a.b(j2, "filePath");
            return (MvNetFileBean) new f().a((l) j2, MvNetFileBean.class);
        } catch (Exception unused) {
            return null;
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.gson.k
    public final /* bridge */ /* synthetic */ MvNetFileBean a(l lVar, Type type, j jVar) {
        return a(lVar);
    }
}
