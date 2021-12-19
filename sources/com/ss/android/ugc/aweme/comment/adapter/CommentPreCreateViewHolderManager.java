package com.ss.android.ugc.aweme.comment.adapter;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import h.a.n;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class CommentPreCreateViewHolderManager {

    /* renamed from: e  reason: collision with root package name */
    public static final a f71289e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f71290a = 5;

    /* renamed from: b  reason: collision with root package name */
    final Map<Integer, List<RecyclerView.ViewHolder>> f71291b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    public final ad f71292c;

    /* renamed from: d  reason: collision with root package name */
    public final ViewGroup f71293d;

    static {
        Covode.recordClassIndex(43884);
    }

    public final class PreCreateViewHolderLegoTask implements w {
        static {
            Covode.recordClassIndex(43885);
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final int bK_() {
            return 1048575;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final ad f() {
            return x.a(this);
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final String g() {
            return "task_";
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final boolean i() {
            return true;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final List j() {
            return null;
        }

        @Override // com.ss.android.ugc.aweme.lego.w
        public final ae b() {
            return ae.BACKGROUND;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final ab k() {
            return ab.DEFAULT;
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final String h() {
            return getClass().getSimpleName();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public PreCreateViewHolderLegoTask() {
        }

        @Override // com.ss.android.ugc.aweme.lego.n
        public final void a(Context context) {
            MethodCollector.i(3053);
            int[] a2 = CommentPreCreateViewHolderManager.this.f71292c.a();
            int i2 = 0;
            do {
                int i3 = a2[i2];
                int i4 = CommentPreCreateViewHolderManager.this.f71290a;
                for (int i5 = 0; i5 < i4; i5++) {
                    CommentPreCreateViewHolderManager commentPreCreateViewHolderManager = CommentPreCreateViewHolderManager.this;
                    RecyclerView.ViewHolder a3 = commentPreCreateViewHolderManager.f71292c.a(i3, CommentPreCreateViewHolderManager.this.f71293d);
                    l.d(a3, "");
                    synchronized (commentPreCreateViewHolderManager.f71291b) {
                        try {
                            if (commentPreCreateViewHolderManager.f71291b.get(Integer.valueOf(i3)) == null) {
                                commentPreCreateViewHolderManager.f71291b.put(Integer.valueOf(i3), n.c(a3));
                            } else {
                                List<RecyclerView.ViewHolder> list = commentPreCreateViewHolderManager.f71291b.get(Integer.valueOf(i3));
                                if (list == null) {
                                    l.b();
                                }
                                Boolean.valueOf(list.add(a3));
                            }
                        } catch (Throwable th) {
                            MethodCollector.o(3053);
                            throw th;
                        }
                    }
                }
                i2++;
            } while (i2 < 2);
            MethodCollector.o(3053);
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(43886);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final RecyclerView.ViewHolder a(int i2) {
        RecyclerView.ViewHolder viewHolder;
        MethodCollector.i(763);
        synchronized (this.f71291b) {
            try {
                List<RecyclerView.ViewHolder> list = this.f71291b.get(Integer.valueOf(i2));
                viewHolder = null;
                if (list != null && list.size() > 0) {
                    viewHolder = list.get(0);
                    list.remove(viewHolder);
                }
            } finally {
                MethodCollector.o(763);
            }
        }
        return viewHolder;
    }

    public CommentPreCreateViewHolderManager(ad adVar, ViewGroup viewGroup) {
        l.d(adVar, "");
        l.d(viewGroup, "");
        this.f71292c = adVar;
        this.f71293d = viewGroup;
    }
}
