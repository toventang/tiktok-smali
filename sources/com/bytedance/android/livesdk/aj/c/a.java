package com.bytedance.android.livesdk.aj.c;

import android.content.Context;
import com.bytedance.android.live.n.e;
import com.bytedance.android.live.n.k;
import com.bytedance.android.livesdk.chatroom.c.r;
import com.bytedance.android.livesdkapi.depend.d.g;
import com.bytedance.android.livesdkapi.view.TextureRenderView;
import com.bytedance.android.livesdkapi.view.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public Context f13811a;

    /* renamed from: b  reason: collision with root package name */
    public TextureRenderView f13812b;

    /* renamed from: c  reason: collision with root package name */
    public k f13813c;

    /* renamed from: d  reason: collision with root package name */
    public e f13814d;

    /* renamed from: e  reason: collision with root package name */
    public int f13815e = 0;

    /* renamed from: f  reason: collision with root package name */
    public c.a f13816f;

    /* renamed from: g  reason: collision with root package name */
    private f.a.b.a f13817g = new f.a.b.a();

    /* renamed from: h  reason: collision with root package name */
    private g.c f13818h = new g.c() {
        /* class com.bytedance.android.livesdk.aj.c.a.AnonymousClass1 */

        static {
            Covode.recordClassIndex(7682);
        }

        @Override // com.bytedance.android.livesdkapi.depend.d.g.c
        public final void a(g.b bVar, Object obj) {
            if (a.this.f13814d != null && a.this.f13813c != null) {
                switch (AnonymousClass2.f13820a[bVar.ordinal()]) {
                    case 1:
                        if (a.this.f13816f != null) {
                        }
                        return;
                    case 2:
                        if (a.this.f13815e != 1) {
                            a.this.f13815e = 2;
                        }
                        if (obj == null) {
                            return;
                        }
                        return;
                    case 3:
                        a.this.f13815e = 1;
                        a.this.f13814d.a(a.this.f13811a);
                        if (a.this.f13816f == null) {
                            return;
                        }
                        return;
                    case 4:
                        if (a.this.f13816f == null) {
                            return;
                        }
                        return;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                        if (a.this.f13816f == null) {
                            return;
                        }
                        return;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                        if (a.this.f13816f == null) {
                            return;
                        }
                        return;
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                        try {
                            int parseInt = Integer.parseInt((String) obj);
                            if (parseInt != 0) {
                                int i2 = 65535 & parseInt;
                                int i3 = parseInt >> 16;
                                if (a.this.f13812b != null) {
                                    a.this.f13812b.setScaleType(2);
                                    a.this.f13812b.a(i2, i3);
                                    return;
                                }
                                return;
                            }
                            return;
                        } catch (Exception e2) {
                            com.bytedance.android.live.core.c.a.a(6, "LivePlayerView", e2.toString());
                            return;
                        }
                    default:
                        return;
                }
            }
        }
    };

    static {
        Covode.recordClassIndex(7681);
    }

    public final void onEvent(r rVar) {
    }

    /* renamed from: com.bytedance.android.livesdk.aj.c.a$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f13820a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
        static {
            /*
                r0 = 7683(0x1e03, float:1.0766E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.android.livesdkapi.depend.d.g$b[] r0 = com.bytedance.android.livesdkapi.depend.d.g.b.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.android.livesdk.aj.c.a.AnonymousClass2.f13820a = r2
                com.bytedance.android.livesdkapi.depend.d.g$b r0 = com.bytedance.android.livesdkapi.depend.d.g.b.COMPLETE_PLAY     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.android.livesdk.aj.c.a.AnonymousClass2.f13820a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bytedance.android.livesdkapi.depend.d.g$b r0 = com.bytedance.android.livesdkapi.depend.d.g.b.MEDIA_ERROR     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.bytedance.android.livesdk.aj.c.a.AnonymousClass2.f13820a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.bytedance.android.livesdkapi.depend.d.g$b r0 = com.bytedance.android.livesdkapi.depend.d.g.b.DISPLAYED_PLAY     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                int[] r2 = com.bytedance.android.livesdk.aj.c.a.AnonymousClass2.f13820a     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.bytedance.android.livesdkapi.depend.d.g$b r0 = com.bytedance.android.livesdkapi.depend.d.g.b.INTERACT_SEI     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r2 = com.bytedance.android.livesdk.aj.c.a.AnonymousClass2.f13820a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.bytedance.android.livesdkapi.depend.d.g$b r0 = com.bytedance.android.livesdkapi.depend.d.g.b.BUFFERING_START     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r2 = com.bytedance.android.livesdk.aj.c.a.AnonymousClass2.f13820a     // Catch:{ NoSuchFieldError -> 0x004e }
                com.bytedance.android.livesdkapi.depend.d.g$b r0 = com.bytedance.android.livesdkapi.depend.d.g.b.BUFFERING_END     // Catch:{ NoSuchFieldError -> 0x004e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r0 = 6
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r2 = com.bytedance.android.livesdk.aj.c.a.AnonymousClass2.f13820a     // Catch:{ NoSuchFieldError -> 0x0059 }
                com.bytedance.android.livesdkapi.depend.d.g$b r0 = com.bytedance.android.livesdkapi.depend.d.g.b.VIDEO_SIZE_CHANGED     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r0 = 7
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.aj.c.a.AnonymousClass2.<clinit>():void");
        }
    }

    public a(Context context) {
        this.f13811a = context;
    }
}
