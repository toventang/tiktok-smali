package com.ss.android.ugc.aweme.dmt_integration.typeadapter;

import com.bytedance.covode.number.Covode;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.o;
import com.ss.android.ugc.aweme.mvtheme.d;
import com.ss.android.ugc.aweme.port.in.g;
import java.lang.reflect.Type;

public final class MvCreateVideoDataDeserializer implements k<d> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f82950a = new a((byte) 0);

    static {
        Covode.recordClassIndex(51711);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(51712);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private static d a(l lVar) {
        o oVar;
        if (lVar != null) {
            try {
                oVar = lVar.j();
            } catch (Exception unused) {
                return null;
            }
        } else {
            oVar = null;
        }
        if (oVar != null) {
            a.a(oVar, "select_media_list");
            a.a(oVar, "select_media_list", "new_select_media_list");
        }
        if (oVar != null) {
            a.a(oVar, "select_src_media_list");
            a.a(oVar, "select_src_media_list", "new_select_src_media_list");
        }
        if (oVar != null) {
            a.a(oVar, "photo_to_save");
            a.a(oVar, "photo_to_save", "new_photo_to_save");
        }
        if (oVar != null) {
            a.b(oVar, "mv_contact_video_path");
            a.b(oVar, "mv_contact_video_path", "new_mv_contact_video_path");
        }
        return (d) g.a().H().a((l) oVar, d.class);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.gson.k
    public final /* bridge */ /* synthetic */ d a(l lVar, Type type, j jVar) {
        return a(lVar);
    }
}
