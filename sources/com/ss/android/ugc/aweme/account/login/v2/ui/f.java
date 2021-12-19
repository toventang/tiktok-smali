package com.ss.android.ugc.aweme.account.login.v2.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.m.p;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class f {

    /* renamed from: g  reason: collision with root package name */
    public static final c f65068g = new c((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f65069a;

    /* renamed from: b  reason: collision with root package name */
    public int f65070b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f65071c = -1;

    /* renamed from: d  reason: collision with root package name */
    public final RecyclerView f65072d;

    /* renamed from: e  reason: collision with root package name */
    public List<String> f65073e;

    /* renamed from: f  reason: collision with root package name */
    public final h.f.a.b<String, z> f65074f;

    static {
        Covode.recordClassIndex(39988);
    }

    public static final class c {
        static {
            Covode.recordClassIndex(39992);
        }

        private c() {
        }

        public /* synthetic */ c(byte b2) {
            this();
        }

        static final class a extends m implements h.f.a.b<String, z> {
            final /* synthetic */ EditText $editText;
            final /* synthetic */ String $enterFrom;
            final /* synthetic */ String $enterMethod;

            static {
                Covode.recordClassIndex(39993);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(EditText editText, String str, String str2) {
                super(1);
                this.$editText = editText;
                this.$enterFrom = str;
                this.$enterMethod = str2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(String str) {
                String str2 = str;
                l.d(str2, "");
                Editable text = this.$editText.getText();
                if (TextUtils.isEmpty(text)) {
                    this.$editText.setText(str2);
                } else {
                    if (text == null) {
                        l.b();
                    }
                    int a2 = p.a((CharSequence) text.toString(), "@", 0, false, 6);
                    if (a2 != -1) {
                        text.replace(a2, text.length(), str2);
                    } else {
                        text.append((CharSequence) str2);
                    }
                }
                r.a("choose_recommend_email_suffix", new com.ss.android.ugc.aweme.account.a.b.a().a("enter_from", this.$enterFrom).a("enter_method", this.$enterMethod).f62575a);
                return z.f158842a;
            }
        }

        public static f a(RecyclerView recyclerView, EditText editText, String str, String str2) {
            List list;
            List<String> g2;
            l.d(recyclerView, "");
            l.d(editText, "");
            l.d(str, "");
            l.d(str2, "");
            List<String> a2 = com.ss.android.ugc.aweme.account.login.v2.a.a();
            if (a2 == null || (g2 = n.g((Iterable) a2)) == null) {
                list = null;
            } else {
                ArrayList arrayList = new ArrayList(n.a((Iterable) g2, 10));
                for (String str3 : g2) {
                    if (!p.e((CharSequence) str3, (CharSequence) "@")) {
                        str3 = "@".concat(String.valueOf(str3));
                    }
                    arrayList.add(str3);
                }
                list = n.g((Collection) arrayList);
            }
            return new f(recyclerView, list, new a(editText, str, str2));
        }
    }

    public final class a extends RecyclerView.a<b> {
        static {
            Covode.recordClassIndex(39989);
        }

        /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final /* synthetic */ b onCreateViewHolder(ViewGroup viewGroup, int i2) {
            return a(this, viewGroup, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final int getItemCount() {
            int i2;
            MethodCollector.i(8624);
            synchronized (f.this) {
                try {
                    List<String> list = f.this.f65073e;
                    if (list != null) {
                        i2 = list.size();
                    } else {
                        i2 = 0;
                    }
                } finally {
                    MethodCollector.o(8624);
                }
            }
            return i2;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final /* synthetic */ void onBindViewHolder(b bVar, int i2) {
            String str;
            boolean z;
            MethodCollector.i(8623);
            b bVar2 = bVar;
            l.d(bVar2, "");
            synchronized (f.this) {
                try {
                    List<String> list = f.this.f65073e;
                    if (!(list == null || (str = (String) n.b((List) list, i2)) == null)) {
                        if (f.this.f65071c == i2) {
                            z = true;
                        } else {
                            z = false;
                        }
                        l.d(str, "");
                        bVar2.f65076a.setText(str);
                        int b2 = (int) com.bytedance.common.utility.n.b(d.a(), 5.5f);
                        int b3 = (int) com.bytedance.common.utility.n.b(d.a(), 8.0f);
                        if (!bVar2.f65077b.f65069a || bVar2.getAdapterPosition() != 0) {
                            bVar2.f65076a.setSelected(z);
                            bVar2.f65076a.setBackground(bVar2.f65076a.getResources().getDrawable(R.drawable.hi));
                            bVar2.f65076a.setTextColor(bVar2.f65076a.getResources().getColor(R.color.bx));
                            bVar2.f65076a.setPadding(b3, b2, b3, b2);
                        } else {
                            bVar2.f65076a.setBackground(bVar2.f65076a.getResources().getDrawable(R.color.c9));
                            bVar2.f65076a.setTextColor(bVar2.f65076a.getResources().getColor(R.color.c5));
                            bVar2.f65076a.setPadding(0, b2, 0, b2);
                        }
                    }
                } finally {
                    MethodCollector.o(8623);
                }
            }
        }

        private static RecyclerView.ViewHolder a(a aVar, ViewGroup viewGroup, int i2) {
            b bVar;
            boolean a2;
            MethodCollector.i(8626);
            l.d(viewGroup, "");
            if (i2 == 0) {
                View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.gq, viewGroup, false);
                f fVar = f.this;
                if (a3 != null) {
                    bVar = new b(fVar, (TuxTextView) a3);
                } else {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.bytedance.tux.input.TuxTextView");
                    MethodCollector.o(8626);
                    throw nullPointerException;
                }
            } else {
                View a4 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.gj, viewGroup, false);
                f fVar2 = f.this;
                if (a4 != null) {
                    bVar = new b(fVar2, (TuxTextView) a4);
                } else {
                    NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type com.bytedance.tux.input.TuxTextView");
                    MethodCollector.o(8626);
                    throw nullPointerException2;
                }
            }
            try {
                if (bVar.itemView.getParent() != null) {
                    try {
                        a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                    } catch (Exception unused) {
                    }
                    if (a2) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(bVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                        com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                        ViewGroup viewGroup2 = (ViewGroup) bVar.itemView.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(bVar.itemView);
                        }
                    }
                }
            } catch (Exception e2) {
                ai.a(e2);
                com.ss.android.ugc.aweme.framework.a.a.a(e2);
            }
            gg.f143005a = bVar.getClass().getName();
            MethodCollector.o(8626);
            return bVar;
        }
    }

    public final void a(List<String> list) {
        List<String> list2;
        MethodCollector.i(8499);
        synchronized (this) {
            if (list != null) {
                try {
                    list2 = n.g((Collection) list);
                } catch (Throwable th) {
                    MethodCollector.o(8499);
                    throw th;
                }
            } else {
                list2 = null;
            }
            this.f65073e = list2;
            if (list2 != null && !list2.isEmpty()) {
                if (this.f65072d.getVisibility() != 0) {
                    this.f65072d.b(0);
                    this.f65072d.setVisibility(0);
                }
                if (this.f65069a) {
                    List<String> list3 = this.f65073e;
                    if (list3 == null) {
                        l.b();
                    }
                    String string = this.f65072d.getContext().getString(R.string.aq6);
                    l.b(string, "");
                    list3.add(0, string);
                }
                if (this.f65072d.getAdapter() == null) {
                    this.f65072d.setAdapter(new a());
                } else {
                    RecyclerView.a adapter = this.f65072d.getAdapter();
                    if (adapter == null) {
                        l.b();
                    }
                    adapter.notifyDataSetChanged();
                }
            } else if (this.f65072d.getVisibility() != 8) {
                this.f65072d.setVisibility(8);
            }
        }
        MethodCollector.o(8499);
    }

    public final class b extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f65076a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f65077b;

        static {
            Covode.recordClassIndex(39990);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(f fVar, TextView textView) {
            super(textView);
            l.d(textView, "");
            this.f65077b = fVar;
            this.f65076a = textView;
            textView.setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.account.login.v2.ui.f.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ b f65078a;

                static {
                    Covode.recordClassIndex(39991);
                }

                {
                    this.f65078a = r1;
                }

                /* JADX DEBUG: Multi-variable search result rejected for r0v14, resolved type: h.f.a.b<java.lang.String, h.z> */
                /* JADX WARN: Multi-variable type inference failed */
                public final void onClick(View view) {
                    List<String> list;
                    Object b2;
                    ClickAgent.onClick(view);
                    b bVar = this.f65078a;
                    int adapterPosition = bVar.getAdapterPosition();
                    if ((!bVar.f65077b.f65069a || adapterPosition != 0) && (list = bVar.f65077b.f65073e) != null && (b2 = n.b((List) list, adapterPosition)) != null) {
                        bVar.f65077b.f65070b = bVar.f65077b.f65071c;
                        bVar.f65077b.f65071c = adapterPosition;
                        if (bVar.f65077b.f65070b != -1) {
                            RecyclerView.a adapter = bVar.f65077b.f65072d.getAdapter();
                            if (adapter == null) {
                                l.b();
                            }
                            adapter.notifyItemChanged(bVar.f65077b.f65070b);
                        }
                        RecyclerView.a adapter2 = bVar.f65077b.f65072d.getAdapter();
                        if (adapter2 == null) {
                            l.b();
                        }
                        adapter2.notifyItemChanged(bVar.f65077b.f65071c);
                        bVar.f65077b.f65074f.invoke(b2);
                    }
                }
            });
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: h.f.a.b<? super java.lang.String, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public f(RecyclerView recyclerView, List<String> list, h.f.a.b<? super String, z> bVar) {
        l.d(recyclerView, "");
        l.d(bVar, "");
        this.f65072d = recyclerView;
        this.f65073e = list;
        this.f65074f = bVar;
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        List<String> list2 = this.f65073e;
        if (list2 == null || !(!list2.isEmpty())) {
            recyclerView.setVisibility(8);
            return;
        }
        if (this.f65069a) {
            List<String> list3 = this.f65073e;
            if (list3 == null) {
                l.b();
            }
            String string = recyclerView.getContext().getString(R.string.aq6);
            l.b(string, "");
            list3.add(0, string);
        }
        if (recyclerView.getAdapter() == null) {
            recyclerView.setAdapter(new a());
            return;
        }
        RecyclerView.a adapter = recyclerView.getAdapter();
        if (adapter == null) {
            l.b();
        }
        adapter.notifyDataSetChanged();
    }
}
