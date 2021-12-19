package com.ss.android.ugc.aweme.dmt_integration.typeadapter;

import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.o;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import java.lang.reflect.Type;

public final class MultiEditVideoSegmentRecordDataDeserializer implements k<MultiEditVideoSegmentRecordData> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f82949a = new a((byte) 0);

    static {
        Covode.recordClassIndex(51708);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(51709);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private static MultiEditVideoSegmentRecordData a(l lVar) {
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
            a.b(oVar, "video_path");
            a.b(oVar, "video_path", "new_video_path");
        }
        if (oVar != null) {
            a.b(oVar, "draft_video_path");
            a.b(oVar, "draft_video_path", "new_draft_video_path");
        }
        return (MultiEditVideoSegmentRecordData) new f().a((l) oVar, MultiEditVideoSegmentRecordData.class);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.gson.k
    public final /* bridge */ /* synthetic */ MultiEditVideoSegmentRecordData a(l lVar, Type type, j jVar) {
        return a(lVar);
    }
}
