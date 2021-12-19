package com.ss.android.ugc.aweme.story.edit.clip.impl;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.aweme.story.edit.clip.a.b;
import com.ss.android.ugc.aweme.story.edit.model.StoryEditClipModel;
import dmt.av.video.b.j;
import h.f.b.l;

public final class a {
    static {
        Covode.recordClassIndex(89998);
    }

    public static final g a(VEEditClip vEEditClip) {
        l.d(vEEditClip, "");
        return vEEditClip.b().b();
    }

    public static final VEEditClip c(b bVar) {
        l.d(bVar, "");
        return (VEEditClip) b.a(bVar.cy_());
    }

    public static final StoryEditClipModel d(b bVar) {
        l.d(bVar, "");
        VEEditClip c2 = c(bVar);
        if (c2 != null) {
            return c2.f137559g;
        }
        return null;
    }

    public static final j a(b bVar) {
        l.d(bVar, "");
        VEEditClip c2 = c(bVar);
        if (c2 != null) {
            return c2.b();
        }
        return null;
    }

    public static final g b(b bVar) {
        l.d(bVar, "");
        VEEditClip c2 = c(bVar);
        if (c2 != null) {
            return a(c2);
        }
        return null;
    }
}
