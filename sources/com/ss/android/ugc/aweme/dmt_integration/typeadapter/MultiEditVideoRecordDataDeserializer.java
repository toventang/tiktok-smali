package com.ss.android.ugc.aweme.dmt_integration.typeadapter;

import com.bytedance.covode.number.Covode;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.o;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import java.lang.reflect.Type;

public final class MultiEditVideoRecordDataDeserializer implements k<MultiEditVideoRecordData> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f82948a = new a((byte) 0);

    static {
        Covode.recordClassIndex(51705);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(51706);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private static MultiEditVideoRecordData a(l lVar) {
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
            a.b(oVar, "concat_video");
            a.b(oVar, "concat_video", "new_concat_video");
        }
        return (MultiEditVideoRecordData) g.a().H().a((l) oVar, MultiEditVideoRecordData.class);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.gson.k
    public final /* bridge */ /* synthetic */ MultiEditVideoRecordData a(l lVar, Type type, j jVar) {
        return a(lVar);
    }
}
