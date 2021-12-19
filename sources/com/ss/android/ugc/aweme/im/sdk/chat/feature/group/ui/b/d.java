package com.ss.android.ugc.aweme.im.sdk.chat.feature.group.ui.b;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.GroupGreetingContent;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class d extends com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a<GroupGreetingContent> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f100591a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private List<b> f100592b = new ArrayList();
    private final h x = i.a((h.f.a.a) b.f100593a);

    static {
        Covode.recordClassIndex(64346);
    }

    private final a i() {
        return (a) this.x.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(64347);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<a> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f100593a = new b();

        static {
            Covode.recordClassIndex(64348);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ a invoke() {
            return new a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(View view, com.ss.android.ugc.aweme.im.sdk.chat.data.e.b bVar) {
        super(view);
        l.d(view, "");
        l.d(bVar, "");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.im.core.d.ai, com.bytedance.im.core.d.ai, com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent, int] */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.a
    public final /* synthetic */ void a(ai aiVar, ai aiVar2, GroupGreetingContent groupGreetingContent, int i2) {
        List<IMUser> userList;
        GroupGreetingContent groupGreetingContent2 = groupGreetingContent;
        l.d(aiVar, "");
        super.a(aiVar, aiVar2, groupGreetingContent2, i2);
        View view = this.itemView;
        l.b(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        RecyclerView.j jVar = (RecyclerView.j) layoutParams;
        jVar.setMargins(0, this.f101313d, 0, 0);
        View view2 = this.itemView;
        l.b(view2, "");
        view2.setLayoutParams(jVar);
        this.f100592b.clear();
        View view3 = this.itemView;
        l.b(view3, "");
        RecyclerView recyclerView = (RecyclerView) view3.findViewById(R.id.bda);
        l.b(recyclerView, "");
        recyclerView.setAdapter(i());
        View view4 = this.itemView;
        l.b(view4, "");
        RecyclerView recyclerView2 = (RecyclerView) view4.findViewById(R.id.bda);
        l.b(recyclerView2, "");
        View view5 = this.itemView;
        l.b(view5, "");
        view5.getContext();
        recyclerView2.setLayoutManager(new LinearLayoutManager(0, false));
        if (!(groupGreetingContent2 == null || (userList = groupGreetingContent2.getUserList()) == null)) {
            if (userList.size() > 6) {
                List<b> list = this.f100592b;
                List<IMUser> subList = userList.subList(0, 6);
                ArrayList arrayList = new ArrayList(n.a((Iterable) subList, 10));
                Iterator<T> it = subList.iterator();
                while (it.hasNext()) {
                    arrayList.add(new b(it.next()));
                }
                list.addAll(n.a((Collection) arrayList, (Object) new b(null, userList.size() - 6)));
            } else {
                List<b> list2 = this.f100592b;
                ArrayList arrayList2 = new ArrayList(n.a((Iterable) userList, 10));
                Iterator<T> it2 = userList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new b(it2.next()));
                }
                list2.addAll(arrayList2);
            }
        }
        i().d(false);
        i().b_(this.f100592b);
    }
}
