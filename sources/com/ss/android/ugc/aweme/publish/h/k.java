package com.ss.android.ugc.aweme.publish.h;

import android.app.Application;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.port.internal.IVideoRecordPreferences;
import com.ss.android.ugc.aweme.publish.l;
import com.ss.android.ugc.aweme.publish.o;
import h.a.z;
import java.util.ArrayList;
import java.util.List;

final class k implements l {
    static {
        Covode.recordClassIndex(77180);
    }

    public static final class a extends com.google.gson.b.a<ArrayList<String>> {
        static {
            Covode.recordClassIndex(77181);
        }

        a() {
        }
    }

    public static final class b extends com.google.gson.b.a<ArrayList<String>> {
        static {
            Covode.recordClassIndex(77182);
        }

        b() {
        }
    }

    public static final class c extends com.google.gson.b.a<ArrayList<String>> {
        static {
            Covode.recordClassIndex(77183);
        }

        c() {
        }
    }

    @Override // com.ss.android.ugc.aweme.publish.l
    public final void b() {
        com.bytedance.cukaie.closet.a aVar = new com.bytedance.cukaie.closet.a();
        Application application = i.f115645a;
        h.f.b.l.b(application, "");
        ((IVideoRecordPreferences) aVar.a(application, IVideoRecordPreferences.class)).setPublishParallelUploadRecoverPath("");
    }

    @Override // com.ss.android.ugc.aweme.publish.l
    public final List<String> a() {
        com.bytedance.cukaie.closet.a aVar = new com.bytedance.cukaie.closet.a();
        Application application = i.f115645a;
        h.f.b.l.b(application, "");
        ArrayList arrayList = (ArrayList) new f().a(((IVideoRecordPreferences) aVar.a(application, IVideoRecordPreferences.class)).getPublishParallelUploadRecoverPath(""), new b().type);
        if (arrayList != null) {
            return arrayList;
        }
        return z.INSTANCE;
    }

    @Override // com.ss.android.ugc.aweme.publish.l
    public final void a(String str) {
        com.bytedance.cukaie.closet.a aVar = new com.bytedance.cukaie.closet.a();
        Application application = i.f115645a;
        h.f.b.l.b(application, "");
        IVideoRecordPreferences iVideoRecordPreferences = (IVideoRecordPreferences) aVar.a(application, IVideoRecordPreferences.class);
        if (str == null) {
            str = "";
        }
        iVideoRecordPreferences.setUploadRecoverPath(str);
    }

    @Override // com.ss.android.ugc.aweme.publish.l
    public final void b(String str) {
        if (str != null) {
            com.bytedance.cukaie.closet.a aVar = new com.bytedance.cukaie.closet.a();
            Application application = i.f115645a;
            h.f.b.l.b(application, "");
            IVideoRecordPreferences iVideoRecordPreferences = (IVideoRecordPreferences) aVar.a(application, IVideoRecordPreferences.class);
            String publishParallelUploadRecoverPath = iVideoRecordPreferences.getPublishParallelUploadRecoverPath("");
            f fVar = new f();
            ArrayList arrayList = (ArrayList) fVar.a(publishParallelUploadRecoverPath, new a().type);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            if (!arrayList.contains(str)) {
                arrayList.add(str);
            }
            String b2 = fVar.b(arrayList);
            h.f.b.l.b(b2, "");
            iVideoRecordPreferences.setPublishParallelUploadRecoverPath(b2);
        }
    }

    @Override // com.ss.android.ugc.aweme.publish.l
    public final void c(String str) {
        if (str != null) {
            com.bytedance.cukaie.closet.a aVar = new com.bytedance.cukaie.closet.a();
            Application application = i.f115645a;
            h.f.b.l.b(application, "");
            IVideoRecordPreferences iVideoRecordPreferences = (IVideoRecordPreferences) aVar.a(application, IVideoRecordPreferences.class);
            String publishParallelUploadRecoverPath = iVideoRecordPreferences.getPublishParallelUploadRecoverPath("");
            f fVar = new f();
            ArrayList arrayList = (ArrayList) fVar.a(publishParallelUploadRecoverPath, new c().type);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.remove(str);
            String b2 = fVar.b(arrayList);
            h.f.b.l.b(b2, "");
            iVideoRecordPreferences.setPublishParallelUploadRecoverPath(b2);
        }
    }

    @Override // com.ss.android.ugc.aweme.publish.l
    public final void a(e eVar, com.ss.android.ugc.aweme.draft.model.c cVar) {
        h.f.b.l.d(eVar, "");
        o.a(eVar, cVar);
    }
}
