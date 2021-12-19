package com.ss.android.ugc.aweme.shortvideo.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.g;
import com.google.gson.t;
import com.ss.android.ugc.tools.c;

public final class ExtractFramesModelExtKt {
    static {
        Covode.recordClassIndex(84439);
    }

    public static final ExtractFramesModel string2Model(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        ExtractFramesModel extractFramesModel = null;
        if (z) {
            return null;
        }
        try {
            extractFramesModel = (ExtractFramesModel) new g().b().a(str, ExtractFramesModel.class);
            return extractFramesModel;
        } catch (t unused) {
            c.f149151f.b("parser frames data error:\n".concat(String.valueOf(str)));
            return extractFramesModel;
        }
    }
}
