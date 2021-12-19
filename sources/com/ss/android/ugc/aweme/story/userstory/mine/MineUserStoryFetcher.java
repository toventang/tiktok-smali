package com.ss.android.ugc.aweme.story.userstory.mine;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.model.j;
import com.ss.android.ugc.aweme.story.userstory.c;
import f.a.d.f;
import h.a.n;
import h.f.b.l;
import java.util.List;

public final class MineUserStoryFetcher implements Object<Aweme> {

    /* renamed from: a  reason: collision with root package name */
    public final f.a.b.a f138511a;

    /* renamed from: b  reason: collision with root package name */
    public final i f138512b;

    static {
        Covode.recordClassIndex(90602);
    }

    public MineUserStoryFetcher(byte b2) {
        this();
    }

    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    public /* synthetic */ MineUserStoryFetcher() {
        this((i) null);
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        this.f138511a.dispose();
    }

    public static Aweme a() {
        Aweme clone = a.a().clone();
        l.b(clone, "");
        return clone;
    }

    public static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f138514a;

        static {
            Covode.recordClassIndex(90604);
        }

        public b(h.f.a.b bVar) {
            this.f138514a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            h.f.a.b bVar = this.f138514a;
            l.b(obj, "");
            bVar.invoke(obj);
        }
    }

    public MineUserStoryFetcher(i iVar) {
        this.f138512b = iVar;
        this.f138511a = new f.a.b.a();
        if (iVar != null) {
            iVar.a(this);
        }
    }

    public static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f138513a;

        static {
            Covode.recordClassIndex(90603);
        }

        public a(h.f.a.b bVar) {
            this.f138513a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Aweme aweme;
            j jVar = (j) obj;
            List<Aweme> awemes = jVar.getAwemes();
            if (awemes != null && (aweme = (Aweme) n.h((List) awemes)) != null) {
                c.a(aweme, jVar.extra.logid);
                a.a(aweme);
                h.f.a.b bVar = this.f138513a;
                Aweme clone = aweme.clone();
                l.b(clone, "");
                bVar.invoke(clone);
            }
        }
    }
}
