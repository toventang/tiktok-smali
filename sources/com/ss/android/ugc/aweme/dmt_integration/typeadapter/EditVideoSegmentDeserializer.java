package com.ss.android.ugc.aweme.dmt_integration.typeadapter;

import com.bytedance.covode.number.Covode;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.o;
import com.google.gson.r;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import java.lang.reflect.Type;

public final class EditVideoSegmentDeserializer implements k<EditVideoSegment> {
    static {
        Covode.recordClassIndex(51701);
    }

    private static EditVideoSegment a(l lVar) {
        o oVar;
        l c2;
        if (lVar != null) {
            try {
                oVar = lVar.j();
            } catch (Exception unused) {
                return null;
            }
        } else {
            oVar = null;
        }
        if (!(oVar == null || (c2 = oVar.c("videoPath")) == null || (c2 instanceof r))) {
            oVar.a("videoPath");
            oVar.a("videoPath", c2.j().c("path"));
        }
        return (EditVideoSegment) g.a().H().a((l) oVar, EditVideoSegment.class);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.gson.k
    public final /* bridge */ /* synthetic */ EditVideoSegment a(l lVar, Type type, j jVar) {
        return a(lVar);
    }
}
