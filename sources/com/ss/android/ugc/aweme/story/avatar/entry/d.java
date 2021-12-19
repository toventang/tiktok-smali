package com.ss.android.ugc.aweme.story.avatar.entry;

import android.content.res.Resources;
import android.util.TypedValue;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import h.f.b.g;
import h.f.b.l;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
public abstract class d extends Enum<d> {
    public static final d FEED;
    public static final d FOLLOW_LIST;
    public static final d INBOX;
    public static final d PROFILE;
    public static final d WESTWINDOW;

    /* renamed from: a  reason: collision with root package name */
    private static final /* synthetic */ d[] f136820a;
    private final boolean mayShowPublishProgress;
    private final float ringWidth;
    private final com.ss.android.ugc.aweme.tux.business.story.b themeType;

    static {
        Covode.recordClassIndex(89391);
        e eVar = new e("WESTWINDOW");
        WESTWINDOW = eVar;
        a aVar = new a("FEED");
        FEED = aVar;
        c cVar = new c("INBOX");
        INBOX = cVar;
        C3573d dVar = new C3573d("PROFILE");
        PROFILE = dVar;
        b bVar = new b("FOLLOW_LIST");
        FOLLOW_LIST = bVar;
        f136820a = new d[]{eVar, aVar, cVar, dVar, bVar};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f136820a.clone();
    }

    public abstract void onEnterPlayer(SmartRoute smartRoute);

    static final class c extends d {
        private final float ringWidth;

        static {
            Covode.recordClassIndex(89394);
        }

        @Override // com.ss.android.ugc.aweme.story.avatar.entry.d
        public final float getRingWidth() {
            return this.ringWidth;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(String str) {
            super(str, 2, null);
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            this.ringWidth = TypedValue.applyDimension(1, 2.5f, system.getDisplayMetrics());
        }

        @Override // com.ss.android.ugc.aweme.story.avatar.entry.d
        public final void onEnterPlayer(SmartRoute smartRoute) {
            l.d(smartRoute, "");
            smartRoute.withParam("story type", 0).withParam("video_from", "STORY_ENTRANCE_AVATAR");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.avatar.entry.d$d  reason: collision with other inner class name */
    static final class C3573d extends d {
        private final boolean mayShowPublishProgress = true;

        static {
            Covode.recordClassIndex(89395);
        }

        @Override // com.ss.android.ugc.aweme.story.avatar.entry.d
        public final boolean getMayShowPublishProgress() {
            return this.mayShowPublishProgress;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C3573d(String str) {
            super(str, 3, null);
        }

        @Override // com.ss.android.ugc.aweme.story.avatar.entry.d
        public final void onEnterPlayer(SmartRoute smartRoute) {
            l.d(smartRoute, "");
            smartRoute.withParam("story type", 0);
        }
    }

    static final class e extends d {
        private final boolean mayShowPublishProgress = true;
        private final com.ss.android.ugc.aweme.tux.business.story.b themeType = com.ss.android.ugc.aweme.tux.business.story.b.CONST;

        static {
            Covode.recordClassIndex(89396);
        }

        @Override // com.ss.android.ugc.aweme.story.avatar.entry.d
        public final boolean getMayShowPublishProgress() {
            return this.mayShowPublishProgress;
        }

        @Override // com.ss.android.ugc.aweme.story.avatar.entry.d
        public final com.ss.android.ugc.aweme.tux.business.story.b getThemeType() {
            return this.themeType;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(String str) {
            super(str, 0, null);
        }

        @Override // com.ss.android.ugc.aweme.story.avatar.entry.d
        public final void onEnterPlayer(SmartRoute smartRoute) {
            l.d(smartRoute, "");
            smartRoute.withParam("story type", 0).withParam("video_from", "STORY_ENTRANCE_SIDE_BAR").withParam("enter_from", "westwindow").withParam("previous_page", "westwindow");
        }
    }

    public boolean getMayShowPublishProgress() {
        return this.mayShowPublishProgress;
    }

    public float getRingWidth() {
        return this.ringWidth;
    }

    public com.ss.android.ugc.aweme.tux.business.story.b getThemeType() {
        return this.themeType;
    }

    static final class a extends d {
        static {
            Covode.recordClassIndex(89392);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(String str) {
            super(str, 1, null);
        }

        @Override // com.ss.android.ugc.aweme.story.avatar.entry.d
        public final void onEnterPlayer(SmartRoute smartRoute) {
            l.d(smartRoute, "");
            smartRoute.withParam("story type", 0).withParam("video_from", "STORY_ENTRANCE_AVATAR");
        }
    }

    static final class b extends d {
        static {
            Covode.recordClassIndex(89393);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(String str) {
            super(str, 4, null);
        }

        @Override // com.ss.android.ugc.aweme.story.avatar.entry.d
        public final void onEnterPlayer(SmartRoute smartRoute) {
            l.d(smartRoute, "");
            smartRoute.withParam("story type", 0).withParam("video_from", "STORY_ENTRANCE_AVATAR");
        }
    }

    private d(String str, int i2) {
        this.themeType = com.ss.android.ugc.aweme.tux.business.story.b.LIGHT;
    }

    public /* synthetic */ d(String str, int i2, g gVar) {
        this(str, i2);
    }
}
