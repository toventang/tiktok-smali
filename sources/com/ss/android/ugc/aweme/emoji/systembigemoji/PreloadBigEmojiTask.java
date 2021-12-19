package com.ss.android.ugc.aweme.emoji.systembigemoji;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.emoji.emojichoose.model.b;
import com.ss.android.ugc.aweme.emoji.g.a;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class PreloadBigEmojiTask implements w {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap<b, List<a>> f89421a;

    static {
        Covode.recordClassIndex(56184);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return x.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "task_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.BOOT_FINISH;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    public PreloadBigEmojiTask(LinkedHashMap<b, List<a>> linkedHashMap) {
        this.f89421a = linkedHashMap;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        com.ss.android.ugc.aweme.framework.a.a.a(3, null, "PreloadBigEmojiTask begin preloadBigEmoji");
        LinkedHashMap<b, List<a>> linkedHashMap = this.f89421a;
        if (linkedHashMap != null && (!linkedHashMap.isEmpty())) {
            for (Map.Entry<b, List<a>> entry : this.f89421a.entrySet()) {
                b key = entry.getKey();
                List<a> value = entry.getValue();
                if ((value == null || value.isEmpty()) && key != null) {
                    a.a(key);
                }
            }
        }
    }
}
