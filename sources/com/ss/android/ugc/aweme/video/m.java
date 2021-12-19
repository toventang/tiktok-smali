package com.ss.android.ugc.aweme.video;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.player.sdk.api.i;
import com.ss.android.ugc.aweme.video.config.a;
import com.ss.android.ugc.playerkit.model.m;
import org.json.JSONObject;

public abstract class m implements i {

    /* renamed from: a  reason: collision with root package name */
    protected boolean f143479a;

    static {
        Covode.recordClassIndex(93886);
    }

    /* renamed from: com.ss.android.ugc.aweme.video.m$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f143480a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0039 */
        static {
            /*
                r0 = 93887(0x16ebf, float:1.31564E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.android.ugc.playerkit.model.m$e[] r0 = com.ss.android.ugc.playerkit.model.m.e.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.ss.android.ugc.aweme.video.m.AnonymousClass1.f143480a = r2
                com.ss.android.ugc.playerkit.model.m$e r0 = com.ss.android.ugc.playerkit.model.m.e.Ijk     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.ss.android.ugc.aweme.video.m.AnonymousClass1.f143480a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.android.ugc.playerkit.model.m$e r0 = com.ss.android.ugc.playerkit.model.m.e.EXO     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.ss.android.ugc.aweme.video.m.AnonymousClass1.f143480a     // Catch:{ NoSuchFieldError -> 0x002e }
                com.ss.android.ugc.playerkit.model.m$e r0 = com.ss.android.ugc.playerkit.model.m.e.TT     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = com.ss.android.ugc.aweme.video.m.AnonymousClass1.f143480a     // Catch:{ NoSuchFieldError -> 0x0039 }
                com.ss.android.ugc.playerkit.model.m$e r0 = com.ss.android.ugc.playerkit.model.m.e.IjkHardware     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r2 = com.ss.android.ugc.aweme.video.m.AnonymousClass1.f143480a     // Catch:{ NoSuchFieldError -> 0x0044 }
                com.ss.android.ugc.playerkit.model.m$e r0 = com.ss.android.ugc.playerkit.model.m.e.TT_IJK_ENGINE     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r2 = com.ss.android.ugc.aweme.video.m.AnonymousClass1.f143480a     // Catch:{ NoSuchFieldError -> 0x004f }
                com.ss.android.ugc.playerkit.model.m$e r0 = com.ss.android.ugc.playerkit.model.m.e.TT_HARDWARE     // Catch:{ NoSuchFieldError -> 0x004f }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x004f }
                r0 = 6
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x004f }
            L_0x004f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.video.m.AnonymousClass1.<clinit>():void");
        }
    }

    public m(boolean z) {
        this.f143479a = z;
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.i
    public final void a(String str, long j2, m.e eVar, boolean z, boolean z2) {
        String str2;
        if (j2 > 0) {
            int i2 = AnonymousClass1.f143480a[eVar.ordinal()];
            if (i2 == 2) {
                str2 = "aweme_movie_play_exo";
            } else if (i2 == 3) {
                str2 = "aweme_movie_play_tt";
            } else if (i2 == 4) {
                str2 = "aweme_movie_ijk_hardware";
            } else if (i2 != 5) {
                str2 = "aweme_movie_play";
            } else {
                str2 = "aweme_movie_tt_ijk_engine";
            }
            a.C3820a.f143369a.a().onRecordPrepareTime(str, j2, str2, z, z2);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("key", str);
                jSONObject.put("player_type", str2);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("duration", j2);
                com.ss.android.ugc.playerkit.simapicommon.a.b().monitorEvent("ttmp_play_info_prepare", jSONObject, jSONObject2, null);
            } catch (Throwable th) {
                com.ss.android.ugc.playerkit.simapicommon.a.b().ensureNotReachHere(th);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.i
    public final void b(String str, long j2, m.e eVar, boolean z, boolean z2) {
        String str2;
        if (j2 > 0) {
            int i2 = AnonymousClass1.f143480a[eVar.ordinal()];
            if (i2 == 2) {
                str2 = "aweme_movie_play_exo";
            } else if (i2 == 3) {
                str2 = "aweme_movie_play_tt";
            } else if (i2 == 4) {
                str2 = "aweme_movie_ijk_hardware";
            } else if (i2 == 5) {
                str2 = "aweme_movie_tt_ijk_engine";
            } else if (i2 != 6) {
                str2 = "aweme_movie_play";
            } else {
                str2 = "aweme_movie_tt_hardware";
            }
            a.C3820a.f143369a.a().onRecordFirstFrameTime(str, j2, str2, z, z2);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("key", str);
                jSONObject.put("player_type", str2);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("duration", j2);
                com.ss.android.ugc.playerkit.simapicommon.a.b().monitorEvent("ttmp_play_info_ff", jSONObject, jSONObject2, null);
            } catch (Throwable th) {
                com.ss.android.ugc.playerkit.simapicommon.a.b().ensureNotReachHere(th);
            }
        }
    }
}
