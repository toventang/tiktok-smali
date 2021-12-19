package com.ss.android.ugc.aweme.story.feed.common;

import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.adapter.aj;
import com.ss.android.ugc.aweme.feed.adapter.cf;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryKt;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.aweme.player.sdk.api.j;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.b.e;
import com.ss.android.ugc.aweme.story.b.g;
import com.ss.android.ugc.aweme.story.b.h;
import com.ss.android.ugc.playerkit.model.o;
import com.ss.android.ugc.playerkit.videoview.i;
import com.ss.android.ugc.playerkit.videoview.k;
import h.f.a.b;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public abstract class a extends com.ss.android.ugc.aweme.feed.adapter.a.a {

    /* renamed from: b  reason: collision with root package name */
    public aj f137628b;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.story.f.a f137629c = com.ss.android.ugc.aweme.story.f.a.LOOP_CURRENT_USER;

    /* renamed from: d  reason: collision with root package name */
    public int f137630d = -1;

    /* renamed from: e  reason: collision with root package name */
    public int f137631e = -1;

    /* renamed from: f  reason: collision with root package name */
    public Aweme f137632f;

    /* renamed from: g  reason: collision with root package name */
    public UserStory f137633g;

    /* renamed from: h  reason: collision with root package name */
    public final String f137634h;

    /* renamed from: i  reason: collision with root package name */
    public final String f137635i;

    /* renamed from: j  reason: collision with root package name */
    public String f137636j;

    /* renamed from: k  reason: collision with root package name */
    public final String f137637k;

    /* renamed from: l  reason: collision with root package name */
    public final Set<String> f137638l;

    /* renamed from: m  reason: collision with root package name */
    public final cf f137639m;
    private final List<b> n = new ArrayList();

    static {
        Covode.recordClassIndex(90054);
    }

    public abstract void a(int i2, boolean z);

    @Override // com.ss.android.ugc.aweme.feed.adapter.a.a
    public final void a(k kVar) {
    }

    public abstract int k();

    public abstract int l();

    @Override // com.ss.android.ugc.aweme.feed.adapter.ah
    public final int s() {
        return 3;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.ah
    public final void A() {
        com.ss.android.ugc.aweme.feed.adapter.a.a Q;
        aj ajVar = this.f137628b;
        if (ajVar != null && (Q = ajVar.Q()) != null) {
            Q.z();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.a.a
    public void e() {
        super.e();
        aj ajVar = this.f137628b;
        if (ajVar != null) {
            ajVar.g();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.ah
    public final void z() {
        com.ss.android.ugc.aweme.feed.adapter.a.a Q;
        aj ajVar = this.f137628b;
        if (ajVar != null && (Q = ajVar.Q()) != null) {
            Q.z();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.a.a
    public final i c() {
        com.ss.android.ugc.aweme.feed.adapter.a.a Q;
        aj ajVar = this.f137628b;
        if (ajVar == null || (Q = ajVar.Q()) == null) {
            return null;
        }
        return Q.c();
    }

    @Override // com.ss.android.ugc.playerkit.videoview.h
    public final j.g j() {
        com.ss.android.ugc.aweme.feed.adapter.a.a Q;
        aj ajVar = this.f137628b;
        if (ajVar == null || (Q = ajVar.Q()) == null) {
            return null;
        }
        return Q.j();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.ah
    public final boolean w() {
        com.ss.android.ugc.aweme.feed.adapter.a.a Q;
        aj ajVar = this.f137628b;
        if (ajVar == null || (Q = ajVar.Q()) == null) {
            return false;
        }
        return Q.w();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.ah
    public final Surface x() {
        com.ss.android.ugc.aweme.feed.adapter.a.a Q;
        aj ajVar = this.f137628b;
        if (ajVar == null || (Q = ajVar.Q()) == null) {
            return null;
        }
        return Q.x();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.ah
    public final View y() {
        com.ss.android.ugc.aweme.feed.adapter.a.a Q;
        aj ajVar = this.f137628b;
        if (ajVar == null || (Q = ajVar.Q()) == null) {
            return null;
        }
        return Q.y();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.a.a
    public void a(com.ss.android.ugc.aweme.story.f.a aVar) {
        l.d(aVar, "");
        this.f137629c = aVar;
    }

    public final void b(com.ss.android.ugc.aweme.story.f.a aVar) {
        l.d(aVar, "");
        this.f137629c = aVar;
    }

    public final void c(String str) {
        l.d(str, "");
        this.f137636j = str;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.ah
    public final void b(Aweme aweme) {
        com.ss.android.ugc.aweme.feed.adapter.a.a Q;
        aj ajVar = this.f137628b;
        if (ajVar != null && (Q = ajVar.Q()) != null) {
            Q.b(aweme);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.a.a, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onBuffering(boolean z) {
        com.ss.android.ugc.aweme.feed.adapter.a.a Q;
        aj ajVar = this.f137628b;
        if (ajVar != null && (Q = ajVar.Q()) != null) {
            Q.onBuffering(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.a.a, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onDecoderBuffering(boolean z) {
        com.ss.android.ugc.aweme.feed.adapter.a.a Q;
        aj ajVar = this.f137628b;
        if (ajVar != null && (Q = ajVar.Q()) != null) {
            Q.onDecoderBuffering(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.a.a, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPausePlay(String str) {
        com.ss.android.ugc.aweme.feed.adapter.a.a Q;
        aj ajVar = this.f137628b;
        if (ajVar != null && (Q = ajVar.Q()) != null) {
            Q.onPausePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayCompleted(String str) {
        com.ss.android.ugc.aweme.feed.adapter.a.a Q;
        aj ajVar = this.f137628b;
        if (ajVar != null && (Q = ajVar.Q()) != null) {
            Q.onPlayCompleted(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayCompletedFirstTime(String str) {
        com.ss.android.ugc.aweme.feed.adapter.a.a Q;
        aj ajVar = this.f137628b;
        if (ajVar != null && (Q = ajVar.Q()) != null) {
            Q.onPlayCompletedFirstTime(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.a.a, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayFailed(com.ss.android.ugc.playerkit.model.l lVar) {
        com.ss.android.ugc.aweme.feed.adapter.a.a Q;
        aj ajVar = this.f137628b;
        if (ajVar != null && (Q = ajVar.Q()) != null) {
            Q.onPlayFailed(lVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.a.a, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPlayProgressChange(float f2) {
        com.ss.android.ugc.aweme.feed.adapter.a.a Q;
        aj ajVar = this.f137628b;
        if (ajVar != null && (Q = ajVar.Q()) != null) {
            Q.onPlayProgressChange(f2);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onPreparePlay(String str) {
        com.ss.android.ugc.aweme.feed.adapter.a.a Q;
        aj ajVar = this.f137628b;
        if (ajVar != null && (Q = ajVar.Q()) != null) {
            Q.onPreparePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.a.a, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRenderFirstFrame(o oVar) {
        com.ss.android.ugc.aweme.feed.adapter.a.a Q;
        aj ajVar = this.f137628b;
        if (ajVar != null && (Q = ajVar.Q()) != null) {
            Q.onRenderFirstFrame(oVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onResumePlay(String str) {
        com.ss.android.ugc.aweme.feed.adapter.a.a Q;
        aj ajVar = this.f137628b;
        if (ajVar != null && (Q = ajVar.Q()) != null) {
            Q.onResumePlay(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.a.a, com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public void onRetryOnError(com.ss.android.ugc.playerkit.model.l lVar) {
        com.ss.android.ugc.aweme.feed.adapter.a.a Q;
        aj ajVar = this.f137628b;
        if (ajVar != null && (Q = ajVar.Q()) != null) {
            Q.onRetryOnError(lVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.a.a
    public void a(int i2) {
        super.a(i2);
        aj ajVar = this.f137628b;
        if (ajVar != null) {
            ajVar.a(i2);
        }
    }

    /* access modifiers changed from: protected */
    public final void b(b<? super List<b>, z> bVar) {
        l.d(bVar, "");
        bVar.invoke(this.n);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.ah
    public final void e(int i2) {
        com.ss.android.ugc.aweme.feed.adapter.a.a Q;
        aj ajVar = this.f137628b;
        if (ajVar != null && (Q = ajVar.Q()) != null) {
            Q.e(i2);
        }
    }

    @Override // com.ss.android.ugc.playerkit.videoview.h
    public final void a(OnUIPlayListener onUIPlayListener) {
        com.ss.android.ugc.aweme.feed.adapter.a.a Q;
        aj ajVar = this.f137628b;
        if (ajVar != null && (Q = ajVar.Q()) != null) {
            Q.a(onUIPlayListener);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.ah
    public final void e(boolean z) {
        com.ss.android.ugc.aweme.feed.adapter.a.a Q;
        aj ajVar = this.f137628b;
        if (ajVar != null && (Q = ajVar.Q()) != null) {
            Q.e(z);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(b<? super b, z> bVar) {
        l.d(bVar, "");
        Iterator<T> it = this.n.iterator();
        while (it.hasNext()) {
            bVar.invoke(it.next());
        }
    }

    /* access modifiers changed from: protected */
    public final void d(String str) {
        Aweme aweme;
        Integer num;
        int i2;
        String str2;
        Aweme currentStory;
        Integer currentIndex;
        Aweme aweme2;
        Integer num2;
        Aweme aweme3;
        Integer num3;
        l.d(str, "");
        int hashCode = str.hashCode();
        if (hashCode != -2015881337) {
            if (hashCode != 1431203431) {
                if (hashCode == 1753337067 && str.equals("story_collection_play") && (aweme3 = this.f137632f) != null) {
                    int k2 = k();
                    int l2 = l();
                    String str3 = this.f137639m.f91775j;
                    String str4 = this.f137637k;
                    l.d(aweme3, "");
                    l.d(str3, "");
                    l.d(str4, "");
                    d a2 = new d().a("author_id", com.ss.android.ugc.aweme.story.d.a.a(aweme3)).a("story_collection_id", com.ss.android.ugc.aweme.story.d.a.b(aweme3)).a("item_cnt", k2).a("unread_item_cnt", l2).a("enter_from", str3).a("enter_method", h.f136851b).a("request_id", aweme3.getRequestId());
                    User author = aweme3.getAuthor();
                    if (author != null) {
                        num3 = Integer.valueOf(author.getFollowStatus());
                    } else {
                        num3 = null;
                    }
                    r.a("story_collection_play", a2.a("follow_status", num3).a("enter_position", str4).f66730a);
                }
            } else if (str.equals("story_collection_play_finish") && (aweme2 = this.f137632f) != null) {
                int k3 = k();
                int l3 = l();
                String str5 = this.f137639m.f91775j;
                String str6 = this.f137637k;
                l.d(aweme2, "");
                l.d(str5, "");
                l.d(str6, "");
                d a3 = new d().a("story_collection_id", com.ss.android.ugc.aweme.story.d.a.b(aweme2)).a("item_cnt", k3).a("unread_item_cnt", l3).a("enter_from", str5).a("enter_method", h.f136851b).a("author_id", com.ss.android.ugc.aweme.story.d.a.a(aweme2)).a("request_id", aweme2.getRequestId());
                User author2 = aweme2.getAuthor();
                if (author2 != null) {
                    num2 = Integer.valueOf(author2.getFollowStatus());
                } else {
                    num2 = null;
                }
                r.a("story_collection_play_finish", a3.a("follow_status", num2).a("enter_position", str6).f66730a);
            }
        } else if (str.equals("story_collection_play_end") && (aweme = this.f137632f) != null) {
            int k4 = k();
            int l4 = l();
            String str7 = this.f137639m.f91775j;
            int size = this.f137638l.size();
            String str8 = this.f137637k;
            l.d(aweme, "");
            l.d(str7, "");
            l.d(str8, "");
            d a4 = new d().a("story_collection_id", com.ss.android.ugc.aweme.story.d.a.b(aweme)).a("item_cnt", k4).a("unread_item_cnt", l4).a("enter_from", str7).a("author_id", com.ss.android.ugc.aweme.story.d.a.a(aweme)).a("enter_method", h.f136851b).a("request_id", aweme.getRequestId());
            User author3 = aweme.getAuthor();
            if (author3 != null) {
                num = Integer.valueOf(author3.getFollowStatus());
            } else {
                num = null;
            }
            d a5 = a4.a("follow_status", num);
            UserStory userStory = aweme.getUserStory();
            int i3 = 0;
            if (userStory != null) {
                i2 = (int) userStory.getCurrentPosition();
            } else {
                i2 = 0;
            }
            d a6 = a5.a("story_start_num", i2);
            UserStory userStory2 = aweme.getUserStory();
            if (!(userStory2 == null || (currentIndex = UserStoryKt.currentIndex(userStory2)) == null)) {
                i3 = currentIndex.intValue();
            }
            d a7 = a6.a("story_current_num", i3);
            UserStory userStory3 = aweme.getUserStory();
            if (userStory3 == null || (currentStory = UserStoryKt.currentStory(userStory3)) == null || (str2 = currentStory.getAid()) == null) {
                str2 = "";
            }
            r.a("story_collection_play_end", a7.a("group_id", str2).a("read_cnt", size).a("enter_position", str8).f66730a);
        }
    }

    protected static void a(List<b> list, b bVar) {
        l.d(list, "");
        l.d(bVar, "");
        list.add(bVar);
    }

    public final void a(g gVar, com.ss.android.ugc.aweme.story.b.a aVar) {
        l.d(gVar, "");
        this.f137639m.f91767b.a(new ag(60, new e(gVar, aVar)));
    }

    public a(ViewGroup viewGroup, k kVar, cf cfVar) {
        l.d(viewGroup, "");
        l.d(kVar, "");
        l.d(cfVar, "");
        this.f137639m = cfVar;
        com.ss.android.ugc.aweme.feed.param.b bVar = cfVar.f91770e.param;
        l.b(bVar, "");
        this.f137634h = bVar.getEventType();
        com.ss.android.ugc.aweme.feed.param.b bVar2 = cfVar.f91770e.param;
        l.b(bVar2, "");
        this.f137635i = bVar2.getFrom();
        this.f137636j = "";
        com.ss.android.ugc.aweme.feed.param.b bVar3 = cfVar.f91770e.param;
        l.b(bVar3, "");
        this.f137637k = com.ss.android.ugc.aweme.story.b.i.a(bVar3);
        this.f137638l = new LinkedHashSet();
    }
}
