package com.ss.android.ugc.aweme;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bb.d;
import com.ss.android.ugc.aweme.bb.e;
import com.ss.android.ugc.aweme.liveevent.f;
import h.f.b.g;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
public class ab extends Enum<ab> {
    public static final ab ANCHOR_RESSO;
    public static final ab ANCHOR_RESSO_EXCLUSIVE;
    public static final ab ANCHOR_SHOP_LINK;
    public static final ab ANCHOR_SHOP_MIX;
    public static final ab ANCHOR_SHOP_WINDOW;
    public static final ab ARTICLE;
    public static final ab COMMON_TYPE;
    public static final ab DONATION_STICKER;
    public static final ab DUET;
    public static final ab INDIA_MOVIE;
    public static final ab LIVE_EVENT;
    public static final ab MIXED_VIDEO;
    public static final ab NEWS;
    public static final ab NO_TYPE;
    public static final ab OPEN_PLATFORM_ANCHOR;
    public static final ab PHOTO_MV_ANCHOR;
    public static final ab POI;
    public static final ab PROP;
    public static final ab QUIZLET;
    public static final ab SHOP;
    public static final ab SHOUTOUT;
    public static final ab TIKTOK_GAME;
    public static final ab TRIP_ADVISOR;
    public static final ab TTCM;
    public static final ab UG;
    public static final ab VIA_MAKER;
    public static final ab WIKIHOW;
    public static final ab WIKIPEDIA;
    public static final ab YELP;

    /* renamed from: a  reason: collision with root package name */
    private static final /* synthetic */ ab[] f62559a;
    private int TYPE;

    public static ab valueOf(String str) {
        return (ab) Enum.valueOf(ab.class, str);
    }

    public static ab[] values() {
        return (ab[]) f62559a.clone();
    }

    public final int getTYPE() {
        return this.TYPE;
    }

    static final class a extends ab {
        static {
            Covode.recordClassIndex(38487);
        }

        @Override // com.ss.android.ugc.aweme.ab
        public final com.ss.android.ugc.aweme.bb.c anchorInfo() {
            return new e();
        }

        @Override // com.ss.android.ugc.aweme.ab
        public final com.ss.android.ugc.aweme.b.c adapterFactory(bl blVar) {
            return new com.ss.android.ugc.aweme.b.b(blVar);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(String str) {
            super(str, 28, -100, null);
        }
    }

    static final class b extends ab {
        static {
            Covode.recordClassIndex(38488);
        }

        @Override // com.ss.android.ugc.aweme.ab
        public final com.ss.android.ugc.aweme.bb.c anchorInfo() {
            return new d();
        }

        @Override // com.ss.android.ugc.aweme.ab
        public final com.ss.android.ugc.aweme.b.c adapterFactory(bl blVar) {
            return new com.ss.android.ugc.aweme.b.b(blVar);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(String str) {
            super(str, 11, 18, null);
        }
    }

    static final class c extends ab {
        static {
            Covode.recordClassIndex(38489);
        }

        @Override // com.ss.android.ugc.aweme.ab
        public final com.ss.android.ugc.aweme.bb.c anchorInfo() {
            return new e();
        }

        @Override // com.ss.android.ugc.aweme.ab
        public final com.ss.android.ugc.aweme.b.c adapterFactory(bl blVar) {
            return new f(blVar);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(String str) {
            super(str, 25, 41, null);
        }
    }

    public com.ss.android.ugc.aweme.bb.c anchorInfo() {
        return new com.ss.android.ugc.aweme.bb.a();
    }

    public com.ss.android.ugc.aweme.br.b anchorMob() {
        return new com.ss.android.ugc.aweme.br.a();
    }

    static {
        Covode.recordClassIndex(38486);
        ab abVar = new ab("NO_TYPE", 0, -1);
        NO_TYPE = abVar;
        ab abVar2 = new ab("WIKIPEDIA", 1, 0);
        WIKIPEDIA = abVar2;
        ab abVar3 = new ab("WIKIHOW", 2, 1);
        WIKIHOW = abVar3;
        ab abVar4 = new ab("SHOP", 3, 3);
        SHOP = abVar4;
        ab abVar5 = new ab("ARTICLE", 4, 5);
        ARTICLE = abVar5;
        ab abVar6 = new ab("ANCHOR_SHOP_LINK", 5, 6);
        ANCHOR_SHOP_LINK = abVar6;
        ab abVar7 = new ab("YELP", 6, 8);
        YELP = abVar7;
        ab abVar8 = new ab("TRIP_ADVISOR", 7, 9);
        TRIP_ADVISOR = abVar8;
        ab abVar9 = new ab("UG", 8, 12);
        UG = abVar9;
        ab abVar10 = new ab("OPEN_PLATFORM_ANCHOR", 9, 15);
        OPEN_PLATFORM_ANCHOR = abVar10;
        ab abVar11 = new ab("MIXED_VIDEO", 10, 16);
        MIXED_VIDEO = abVar11;
        b bVar = new b("INDIA_MOVIE");
        INDIA_MOVIE = bVar;
        ab abVar12 = new ab("DONATION_STICKER", 12, 19);
        DONATION_STICKER = abVar12;
        ab abVar13 = new ab("ANCHOR_RESSO", 13, 23);
        ANCHOR_RESSO = abVar13;
        ab abVar14 = new ab("TIKTOK_GAME", 14, 24);
        TIKTOK_GAME = abVar14;
        ab abVar15 = new ab("VIA_MAKER", 15, 26);
        VIA_MAKER = abVar15;
        ab abVar16 = new ab("ANCHOR_RESSO_EXCLUSIVE", 16, 27);
        ANCHOR_RESSO_EXCLUSIVE = abVar16;
        ab abVar17 = new ab("PROP", 17, 28);
        PROP = abVar17;
        ab abVar18 = new ab("PHOTO_MV_ANCHOR", 18, 31);
        PHOTO_MV_ANCHOR = abVar18;
        ab abVar19 = new ab("NEWS", 19, 32);
        NEWS = abVar19;
        ab abVar20 = new ab("ANCHOR_SHOP_WINDOW", 20, 33);
        ANCHOR_SHOP_WINDOW = abVar20;
        ab abVar21 = new ab("ANCHOR_SHOP_MIX", 21, 35);
        ANCHOR_SHOP_MIX = abVar21;
        ab abVar22 = new ab("QUIZLET", 22, 36);
        QUIZLET = abVar22;
        ab abVar23 = new ab("DUET", 23, 37);
        DUET = abVar23;
        ab abVar24 = new ab("SHOUTOUT", 24, 40);
        SHOUTOUT = abVar24;
        c cVar = new c("LIVE_EVENT");
        LIVE_EVENT = cVar;
        ab abVar25 = new ab("POI", 26, 45);
        POI = abVar25;
        ab abVar26 = new ab("TTCM", 27, 46);
        TTCM = abVar26;
        a aVar = new a("COMMON_TYPE");
        COMMON_TYPE = aVar;
        f62559a = new ab[]{abVar, abVar2, abVar3, abVar4, abVar5, abVar6, abVar7, abVar8, abVar9, abVar10, abVar11, bVar, abVar12, abVar13, abVar14, abVar15, abVar16, abVar17, abVar18, abVar19, abVar20, abVar21, abVar22, abVar23, abVar24, cVar, abVar25, abVar26, aVar};
    }

    public final void setTYPE(int i2) {
        this.TYPE = i2;
    }

    public com.ss.android.ugc.aweme.b.c adapterFactory(bl blVar) {
        return new com.ss.android.ugc.aweme.b.a(blVar);
    }

    private ab(String str, int i2, int i3) {
        this.TYPE = i3;
    }

    public /* synthetic */ ab(String str, int i2, int i3, g gVar) {
        this(str, i2, i3);
    }
}
