package com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.k;
import com.bytedance.ies.bullet.c.e.a.b;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import h.f.b.l;

public final class OpenLiveMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f82677b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final String f82678c = "open_live";

    /* renamed from: d  reason: collision with root package name */
    private k.a f82679d = k.a.PRIVATE;

    /* renamed from: e  reason: collision with root package name */
    private String f82680e = "";

    static {
        Covode.recordClassIndex(51496);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(51497);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q, com.bytedance.ies.bullet.c.c.a.e
    public final k.a b() {
        return this.f82679d;
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f82678c;
    }

    @Override // com.bytedance.ies.bullet.c.c.a.e
    public final void a(k.a aVar) {
        l.d(aVar, "");
        this.f82679d = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenLiveMethod(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0222, code lost:
        if (r10 == null) goto L_0x0236;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0224, code lost:
        r11 = r10.getLivePlayerTag();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0228, code lost:
        r1 = r8.f23297a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x022a, code lost:
        if (r10 == null) goto L_0x0233;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x022c, code lost:
        r0 = r10.getStreamData();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0230, code lost:
        r1.f23341e = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0233, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0235, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0236, code lost:
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0238, code lost:
        if (r10 == null) goto L_0x0271;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x023a, code lost:
        r0 = r10.getDataProvider();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x023e, code lost:
        if (r0 == null) goto L_0x0271;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0240, code lost:
        r0 = r0.f67523g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0242, code lost:
        if (r0 == null) goto L_0x0271;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0244, code lost:
        r0 = r0.getNewLiveRoomData();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0248, code lost:
        if (r0 == null) goto L_0x0271;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x024e, code lost:
        if (r0.id != r2) goto L_0x0271;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0250, code lost:
        if (r11 == null) goto L_0x0271;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0252, code lost:
        r8.f23299c.E = r11;
        r8.f23299c.ar = h.f.b.l.a((java.lang.Object) r10.getPlayControllerIsPlaying(), (java.lang.Object) true);
        r1 = r10.getMLivePlayHelper();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x026b, code lost:
        if (r1 == null) goto L_0x0271;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x026d, code lost:
        r1.setPlayControllerShouldDestroy(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0271, code lost:
        r9 = com.ss.android.common.applog.GlobalContext.getContext();
        h.f.b.l.b(r9, "");
        h.f.b.l.b(r6, "");
        com.ss.android.ugc.aweme.discover.ui.c.a.a(r9, r2, r5, r4, r8, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x017c, code lost:
        if (r8 != null) goto L_0x017e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0184, code lost:
        if (r15 == null) goto L_0x0186;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0186, code lost:
        r15 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0187, code lost:
        if (r8 == null) goto L_0x0191;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0189, code lost:
        r14 = r8.optString("search_type");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x018f, code lost:
        if (r14 != null) goto L_0x0194;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0191, code lost:
        r14 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0192, code lost:
        if (r8 == null) goto L_0x019c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0194, code lost:
        r13 = r8.optString("search_result_id");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x019a, code lost:
        if (r13 != null) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x019c, code lost:
        r13 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x019d, code lost:
        if (r8 == null) goto L_0x01a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x019f, code lost:
        r12 = r8.optString("list_item_id");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01a5, code lost:
        if (r12 != null) goto L_0x01aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01a7, code lost:
        r12 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01a8, code lost:
        if (r8 == null) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01aa, code lost:
        r1 = r8.optString("enter_method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01b0, code lost:
        if (r1 != null) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01b2, code lost:
        r1 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01b3, code lost:
        r8 = new com.bytedance.android.livesdkapi.session.EnterRoomConfig();
        r8.f23298b.x = r11;
        r8.f23298b.y = r15;
        r8.f23298b.A = r14;
        r8.f23298b.z = r13;
        r8.f23298b.B = r12;
        r8.f23298b.f23309a = r11;
        r8.f23298b.f23310b = r10;
        r8.f23299c.L = r1;
        r10 = r20.optInt("session_id", -1);
        r0 = com.ss.android.ugc.aweme.live.LiveOuterService.s();
        h.f.b.l.b(r0, "");
        r0 = r0.d().a("search_live_card_reuse_player", (java.lang.Object) false);
        h.f.b.l.b(r0, "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01fe, code lost:
        if (((java.lang.Boolean) r0).booleanValue() == false) goto L_0x0271;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0200, code lost:
        if (r10 < 0) goto L_0x0271;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0202, code lost:
        r0 = com.ss.android.ugc.aweme.xsearch.d.f145151b.b(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0208, code lost:
        if (r0 == null) goto L_0x0219;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x020a, code lost:
        r0 = r0.f145144e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x020c, code lost:
        if (r0 == null) goto L_0x0219;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x020e, code lost:
        r1 = r0.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0216, code lost:
        if ((r1 instanceof com.ss.android.ugc.aweme.autoplay.player.live.i) != false) goto L_0x021c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0219, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x021b, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x021c, code lost:
        r1 = (com.ss.android.ugc.aweme.autoplay.player.live.i) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x021e, code lost:
        if (r1 == null) goto L_0x0235;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0220, code lost:
        r10 = r1.f67538a;
     */
    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(org.json.JSONObject r20, com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.a r21) {
        /*
        // Method dump skipped, instructions count: 672
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.OpenLiveMethod.a(org.json.JSONObject, com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod$a):void");
    }
}
