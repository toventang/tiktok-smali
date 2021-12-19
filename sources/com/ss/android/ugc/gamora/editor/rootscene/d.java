package com.ss.android.ugc.gamora.editor.rootscene;

import com.bytedance.covode.number.Covode;
import com.bytedance.scene.group.b;
import com.ss.android.ugc.aweme.infoSticker.customsticker.model.CustomStickerInfo;
import com.ss.android.ugc.aweme.infoSticker.i;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editor.ac;
import com.ss.android.ugc.gamora.editor.sticker.a;
import h.f.b.l;

public abstract class d extends b {
    public ac u;

    static {
        Covode.recordClassIndex(96230);
    }

    public abstract a G();

    public boolean W() {
        return true;
    }

    public void a(i iVar) {
        l.d(iVar, "");
    }

    public void a(Effect effect, CustomStickerInfo customStickerInfo) {
        l.d(effect, "");
        l.d(customStickerInfo, "");
    }

    public void a(boolean z, boolean z2, Runnable runnable) {
        l.d(runnable, "");
    }

    public void a(boolean z, boolean z2, Runnable runnable, Runnable runnable2) {
        l.d(runnable, "");
    }

    public void a(boolean z, boolean z2, boolean z3, Runnable runnable) {
        l.d(runnable, "");
    }

    public void a(boolean z, boolean z2, boolean z3, Runnable runnable, Runnable runnable2) {
        l.d(runnable, "");
    }

    public boolean aa() {
        return false;
    }

    public void af() {
    }

    public void ag() {
    }

    public void aj() {
    }

    public void an() {
    }

    public void b(boolean z, boolean z2, boolean z3, Runnable runnable) {
        l.d(runnable, "");
    }

    public final ac aq() {
        ac acVar = this.u;
        if (acVar == null) {
            l.a("musicController");
        }
        return acVar;
    }

    public final void a(ac acVar) {
        l.d(acVar, "");
        this.u = acVar;
    }
}
