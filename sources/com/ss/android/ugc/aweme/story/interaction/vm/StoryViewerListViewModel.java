package com.ss.android.ugc.aweme.story.interaction.vm;

import android.text.TextUtils;
import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.ag;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.base.d;
import com.ss.android.ugc.aweme.story.api.IStoryViewerListViewModel;
import com.ss.android.ugc.aweme.story.interaction.api.StoryInteractionApi;
import com.ss.android.ugc.aweme.story.model.h;
import com.ss.android.ugc.aweme.story.model.i;
import f.a.d.f;
import h.a.z;
import h.f.b.l;
import h.p;
import java.util.List;
import java.util.Map;

public final class StoryViewerListViewModel extends IStoryViewerListViewModel {

    /* renamed from: f  reason: collision with root package name */
    public static final a f137962f = new a((byte) 0);

    /* renamed from: g  reason: collision with root package name */
    private final f.a.b.a f137963g = new f.a.b.a();

    /* renamed from: h  reason: collision with root package name */
    private final m f137964h;

    static {
        Covode.recordClassIndex(90230);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(90231);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static StoryViewerListViewModel a(e eVar, ag agVar) {
            l.d(eVar, "");
            l.d(agVar, "");
            ac a2 = d.a(eVar, agVar, new c(eVar)).a(StoryViewerListViewModel.class);
            l.b(a2, "");
            return (StoryViewerListViewModel) a2;
        }
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.DataCenter, androidx.lifecycle.ac
    public final void onCleared() {
        super.onCleared();
        this.f137963g.a();
    }

    public StoryViewerListViewModel(m mVar) {
        l.d(mVar, "");
        this.f137964h = mVar;
        this.f66996a = mVar;
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StoryViewerListViewModel f137968a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f137969b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f137970c;

        static {
            Covode.recordClassIndex(90233);
        }

        c(StoryViewerListViewModel storyViewerListViewModel, long j2, String str) {
            this.f137968a = storyViewerListViewModel;
            this.f137969b = j2;
            this.f137970c = str;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            if (this.f137969b == 0) {
                this.f137968a.a("REFRESH_STORY_VIEWER_LIST_FAIL", this.f137970c);
                ((IStoryViewerListViewModel) this.f137968a).f136726d.put(this.f137970c, 3);
                return;
            }
            this.f137968a.a("LOAD_MORE_STORY_VIEWER_LIST_FAIL", this.f137970c);
            ((IStoryViewerListViewModel) this.f137968a).f136726d.put(this.f137970c, 1);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StoryViewerListViewModel f137965a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f137966b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f137967c;

        static {
            Covode.recordClassIndex(90232);
        }

        b(StoryViewerListViewModel storyViewerListViewModel, String str, long j2) {
            this.f137965a = storyViewerListViewModel;
            this.f137966b = str;
            this.f137967c = j2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            i iVar = (i) obj;
            ((IStoryViewerListViewModel) this.f137965a).f136726d.put(this.f137966b, 2);
            if (this.f137967c == 0) {
                Map<String, i> map = ((IStoryViewerListViewModel) this.f137965a).f136725c;
                String str = this.f137966b;
                l.b(iVar, "");
                map.put(str, iVar);
                this.f137965a.a("REFRESH_STORY_VIEWER_LIST_SUCCESS", new p(this.f137966b, iVar));
                return;
            }
            i iVar2 = ((IStoryViewerListViewModel) this.f137965a).f136725c.get(this.f137966b);
            if (iVar2 != null) {
                iVar2.setTotal(iVar.getTotal());
                iVar2.setCursor(iVar.getCursor());
                List<h> viewerList = iVar2.getViewerList();
                if (viewerList != null) {
                    List<h> viewerList2 = iVar.getViewerList();
                    if (viewerList2 == null) {
                        viewerList2 = z.INSTANCE;
                    }
                    viewerList.addAll(viewerList2);
                }
            }
            this.f137965a.a("LOAD_MORE_STORY_VIEWER_LIST_SUCCESS", new p(this.f137966b, iVar));
        }
    }

    public final void a(String str, long j2) {
        int i2;
        l.d(str, "");
        Integer num = ((IStoryViewerListViewModel) this).f136726d.get(str);
        if (num != null) {
            i2 = num.intValue();
            if (i2 == 0) {
                return;
            }
        } else {
            i2 = -1;
        }
        if (i2 != 1) {
            if (j2 == 0) {
                ((IStoryViewerListViewModel) this).f136726d.put(str, 0);
            } else {
                ((IStoryViewerListViewModel) this).f136726d.put(str, 1);
            }
            if (TextUtils.isEmpty(str)) {
                com.ss.android.ugc.aweme.story.j.a.c("StoryViewerListViewModel", "dz[story id is empty]");
                return;
            }
            f.a.b.b a2 = StoryInteractionApi.f137840a.getStoryViewerList(str, j2, 30, null).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new b(this, str, j2), new c(this, j2, str));
            l.b(a2, "");
            f.a.j.a.a(a2, this.f137963g);
        }
    }
}
