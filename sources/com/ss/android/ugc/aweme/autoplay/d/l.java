package com.ss.android.ugc.aweme.autoplay.d;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.autoplay.player.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.flowfeed.utils.i;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.m;
import h.h;

public final class l extends i {

    /* renamed from: a  reason: collision with root package name */
    public int f67432a;

    /* renamed from: b  reason: collision with root package name */
    public Aweme f67433b;

    /* renamed from: c  reason: collision with root package name */
    public final b.d f67434c;

    /* renamed from: d  reason: collision with root package name */
    private final h f67435d = h.i.a((h.f.a.a) a.f67437a);

    /* renamed from: i  reason: collision with root package name */
    private final h f67436i = h.i.a((h.f.a.a) b.f67438a);

    static final class a extends m implements h.f.a.a<int[]> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f67437a = new a();

        static {
            Covode.recordClassIndex(41521);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ int[] invoke() {
            return new int[2];
        }
    }

    static {
        Covode.recordClassIndex(41520);
    }

    private final int[] g() {
        return (int[]) this.f67435d.getValue();
    }

    private final Rect h() {
        return (Rect) this.f67436i.getValue();
    }

    @Override // com.ss.android.ugc.aweme.flowfeed.utils.i
    public final int a() {
        return this.f67432a;
    }

    static final class b extends m implements h.f.a.a<Rect> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f67438a = new b();

        static {
            Covode.recordClassIndex(41522);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Rect invoke() {
            return new Rect();
        }
    }

    @Override // com.ss.android.ugc.aweme.flowfeed.utils.i
    public final void b() {
        this.f67434c.y();
    }

    @Override // com.ss.android.ugc.aweme.flowfeed.utils.i
    public final Rect c() {
        View w = this.f67434c.w();
        if (w != null) {
            w.getLocationOnScreen(g());
            h().set(g()[0], g()[1], g()[0] + w.getWidth(), g()[1] + w.getHeight());
        }
        return h();
    }

    @Override // com.ss.android.ugc.aweme.flowfeed.utils.i
    public final String d() {
        String str;
        User author;
        User author2;
        User author3;
        Aweme aweme = this.f67433b;
        if (aweme == null || aweme.getAuthor() == null) {
            return "SearchMultiVideoScrollObserver";
        }
        Aweme aweme2 = this.f67433b;
        if (aweme2 == null || (author3 = aweme2.getAuthor()) == null) {
            str = null;
        } else {
            str = author3.getRemarkName();
        }
        if (TextUtils.isEmpty(str)) {
            Aweme aweme3 = this.f67433b;
            if (aweme3 == null || (author2 = aweme3.getAuthor()) == null) {
                return null;
            }
            return author2.getNickname();
        }
        Aweme aweme4 = this.f67433b;
        if (aweme4 == null || (author = aweme4.getAuthor()) == null) {
            return null;
        }
        return author.getRemarkName();
    }

    @Override // com.ss.android.ugc.aweme.flowfeed.utils.i
    public final void a(int i2) {
        if (i2 == 0 || i2 == 1) {
            this.f67434c.x();
        }
    }

    @Override // com.ss.android.ugc.aweme.flowfeed.utils.i
    public final void b(int i2) {
        super.b(i2);
        if (i2 == 0 || i2 == 1) {
            this.f67434c.x();
        }
    }

    public l(b.d dVar) {
        h.f.b.l.d(dVar, "");
        this.f67434c = dVar;
    }
}
