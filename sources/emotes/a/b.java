package emotes.a;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.user.SubscribeBadge;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.chatroom.ui.SSGridLayoutManager;
import com.bytedance.android.livesdk.j.ac;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import emotes.c.h;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.List;

public final class b extends ConstraintLayout implements e.c.a, c, d {
    public static final a t = new a((byte) 0);

    /* renamed from: g  reason: collision with root package name */
    public RecyclerView f157082g;

    /* renamed from: h  reason: collision with root package name */
    public final j.a.a.f f157083h = new j.a.a.f();

    /* renamed from: i  reason: collision with root package name */
    public SSGridLayoutManager f157084i;

    /* renamed from: j  reason: collision with root package name */
    public AbstractC4151b f157085j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f157086k;

    /* renamed from: l  reason: collision with root package name */
    public int f157087l = 5;

    /* renamed from: m  reason: collision with root package name */
    public boolean f157088m;
    public boolean n;
    public boolean o;
    public final j.a.a.d p = new j.a.a.d();
    public final ArrayList<EmoteModel> q = new ArrayList<>();
    public f.a.b.a r = new f.a.b.a();
    public int s = y.a(58.0f);
    private final emotes.b.b u = new emotes.b.b();
    private com.bytedance.android.live.e.a.a.a v;
    private boolean w;

    /* renamed from: emotes.a.b$b  reason: collision with other inner class name */
    public interface AbstractC4151b {
        static {
            Covode.recordClassIndex(104315);
        }

        void a();

        void a(boolean z);
    }

    static {
        Covode.recordClassIndex(104313);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(104314);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final boolean b() {
        if (this.f157088m || this.o) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.r.a();
    }

    public final void c() {
        boolean z;
        if (!this.q.isEmpty()) {
            this.p.clear();
            j.a.a.d dVar = this.p;
            if (!this.f157088m && !this.o) {
                dVar.add(0, new h(this.n, this.f157088m));
            }
            for (T t2 : this.q) {
                if (this.f157088m || this.o) {
                    z = false;
                } else {
                    z = true;
                }
                t2.f7394k = z;
                t2.f7395l = this.w;
            }
            dVar.addAll(this.q);
            this.f157083h.notifyDataSetChanged();
        }
    }

    public final void setOnEmojiSelectListener(com.bytedance.android.live.e.a.a.a aVar) {
        this.v = aVar;
    }

    public static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f157089a;

        static {
            Covode.recordClassIndex(104316);
        }

        public c(b bVar) {
            this.f157089a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f157089a.onEvent((com.bytedance.android.livesdkapi.depend.b.a) obj);
        }
    }

    public static final class f extends GridLayoutManager.c {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ b f157090e;

        static {
            Covode.recordClassIndex(104319);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public f(b bVar) {
            this.f157090e = bVar;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public final int a(int i2) {
            if (this.f157090e.f157083h.getItemViewType(i2) == 0) {
                return this.f157090e.f157087l;
            }
            return 1;
        }
    }

    public final void setEmoteSelectPanelCallback(AbstractC4151b bVar) {
        l.d(bVar, "");
        this.f157085j = bVar;
    }

    @Override // e.c.a
    public final void a(com.bytedance.android.live.base.model.emoji.a aVar) {
        com.bytedance.android.live.e.a.a.a aVar2;
        if (aVar != null && (aVar2 = this.v) != null) {
            aVar2.a(aVar);
        }
    }

    public final void a(boolean z) {
        if (this.w != z) {
            this.w = z;
            c();
        }
    }

    public final void onEvent(com.bytedance.android.livesdkapi.depend.b.a aVar) {
        com.bytedance.android.livesdkapi.depend.model.b.a aVar2;
        if (aVar != null && (aVar2 = aVar.f22946a) != null) {
            this.n = aVar2.b();
            c();
        }
    }

    public static final class d extends m implements h.f.a.b<SubscribeBadge, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(104317);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(SubscribeBadge subscribeBadge) {
            l.d(subscribeBadge, "");
            this.this$0.f157088m = true;
            AbstractC4151b bVar = this.this$0.f157085j;
            if (bVar != null) {
                bVar.a(this.this$0.b());
            }
            this.this$0.c();
            return z.f158842a;
        }
    }

    public static final class e extends m implements h.f.a.b<List<EmoteModel>, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(104318);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(b bVar) {
            super(1);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(List<EmoteModel> list) {
            List<EmoteModel> list2 = list;
            l.d(list2, "");
            if (list2.size() > 0 && this.this$0.q.size() == 0) {
                this.this$0.q.addAll(list2);
                this.this$0.c();
            }
            return z.f158842a;
        }
    }

    @Override // emotes.a.d
    public final void a(String str) {
        Room room = (Room) DataChannelGlobal.f34575d.b(ac.class);
        if (room != null) {
            AbstractC4151b bVar = this.f157085j;
            if (bVar != null) {
                bVar.a();
            }
            Context context = getContext();
            l.b(context, "");
            ((com.bytedance.android.live.o.a) com.bytedance.android.live.t.a.a(com.bytedance.android.live.o.a.class)).openUserSubscribeEntry(context, room, str);
        }
    }

    public b(Context context) {
        super(context);
        MethodCollector.i(2136);
        LayoutInflater.from(context).inflate(R.layout.beo, this);
        MethodCollector.o(2136);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        if (r9 != 3) goto L_0x003e;
     */
    @Override // emotes.a.c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(android.view.View r12, android.view.MotionEvent r13, int r14, com.bytedance.android.live.base.model.emoji.EmoteModel r15) {
        /*
        // Method dump skipped, instructions count: 199
        */
        throw new UnsupportedOperationException("Method not decompiled: emotes.a.b.a(android.view.View, android.view.MotionEvent, int, com.bytedance.android.live.base.model.emoji.EmoteModel):boolean");
    }
}
