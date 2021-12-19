package com.ss.android.ugc.aweme.ecommerce.address.edit.a;

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

public final class b {

    /* renamed from: f  reason: collision with root package name */
    public static final c f84400f = new c((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f84401a = -1;

    /* renamed from: b  reason: collision with root package name */
    public int f84402b = -1;

    /* renamed from: c  reason: collision with root package name */
    public final RecyclerView f84403c;

    /* renamed from: d  reason: collision with root package name */
    public List<String> f84404d;

    /* renamed from: e  reason: collision with root package name */
    public final h.f.a.b<String, z> f84405e;

    static {
        Covode.recordClassIndex(52667);
    }

    public static final class c {
        static {
            Covode.recordClassIndex(52671);
        }

        private c() {
        }

        public /* synthetic */ c(byte b2) {
            this();
        }

        static final class a extends m implements h.f.a.b<String, z> {
            final /* synthetic */ EditText $editText;

            static {
                Covode.recordClassIndex(52672);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(EditText editText) {
                super(1);
                this.$editText = editText;
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
                return z.f158842a;
            }
        }

        public static b a(RecyclerView recyclerView, EditText editText) {
            List list;
            List<String> g2;
            l.d(recyclerView, "");
            l.d(editText, "");
            List<String> a2 = a.a();
            if (a2 == null || (g2 = n.g((Iterable) a2)) == null) {
                list = null;
            } else {
                ArrayList arrayList = new ArrayList(n.a((Iterable) g2, 10));
                for (String str : g2) {
                    if (!p.e((CharSequence) str, (CharSequence) "@")) {
                        str = "@".concat(String.valueOf(str));
                    }
                    arrayList.add(str);
                }
                list = n.g((Collection) arrayList);
            }
            return new b(recyclerView, list, new a(editText));
        }
    }

    public final class a extends RecyclerView.a<C2015b> {
        static {
            Covode.recordClassIndex(52668);
        }

        /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final /* synthetic */ C2015b onCreateViewHolder(ViewGroup viewGroup, int i2) {
            return a(this, viewGroup, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final int getItemCount() {
            List<String> list = b.this.f84404d;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final /* synthetic */ void onBindViewHolder(C2015b bVar, int i2) {
            String str;
            boolean z;
            C2015b bVar2 = bVar;
            l.d(bVar2, "");
            List<String> list = b.this.f84404d;
            if (list != null && (str = (String) n.b((List) list, i2)) != null) {
                if (b.this.f84402b == i2) {
                    z = true;
                } else {
                    z = false;
                }
                l.d(str, "");
                bVar2.f84407a.setText(str);
                bVar2.f84407a.setSelected(z);
            }
        }

        private static RecyclerView.ViewHolder a(a aVar, ViewGroup viewGroup, int i2) {
            boolean a2;
            MethodCollector.i(5204);
            l.d(viewGroup, "");
            View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.om, viewGroup, false);
            b bVar = b.this;
            if (a3 != null) {
                C2015b bVar2 = new C2015b(bVar, (TextView) a3);
                try {
                    if (bVar2.itemView.getParent() != null) {
                        try {
                            a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                        } catch (Exception unused) {
                        }
                        if (a2) {
                            StringBuffer stringBuffer = new StringBuffer();
                            stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(bVar2.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                            com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                            ViewGroup viewGroup2 = (ViewGroup) bVar2.itemView.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(bVar2.itemView);
                            }
                        }
                    }
                } catch (Exception e2) {
                    ai.a(e2);
                    com.ss.android.ugc.aweme.framework.a.a.a(e2);
                }
                gg.f143005a = bVar2.getClass().getName();
                MethodCollector.o(5204);
                return bVar2;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            MethodCollector.o(5204);
            throw nullPointerException;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.a.b$b  reason: collision with other inner class name */
    public final class C2015b extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f84407a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f84408b;

        static {
            Covode.recordClassIndex(52669);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2015b(b bVar, TextView textView) {
            super(textView);
            l.d(textView, "");
            this.f84408b = bVar;
            this.f84407a = textView;
            textView.setOnClickListener(new View.OnClickListener(this) {
                /* class com.ss.android.ugc.aweme.ecommerce.address.edit.a.b.C2015b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C2015b f84409a;

                static {
                    Covode.recordClassIndex(52670);
                }

                {
                    this.f84409a = r1;
                }

                /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: h.f.a.b<java.lang.String, h.z> */
                /* JADX WARN: Multi-variable type inference failed */
                public final void onClick(View view) {
                    Object b2;
                    ClickAgent.onClick(view);
                    C2015b bVar = this.f84409a;
                    int adapterPosition = bVar.getAdapterPosition();
                    List<String> list = bVar.f84408b.f84404d;
                    if (list != null && (b2 = n.b((List) list, adapterPosition)) != null) {
                        bVar.f84408b.f84401a = bVar.f84408b.f84402b;
                        bVar.f84408b.f84402b = adapterPosition;
                        if (bVar.f84408b.f84401a != -1) {
                            RecyclerView.a adapter = bVar.f84408b.f84403c.getAdapter();
                            if (adapter == null) {
                                l.b();
                            }
                            adapter.notifyItemChanged(bVar.f84408b.f84401a);
                        }
                        RecyclerView.a adapter2 = bVar.f84408b.f84403c.getAdapter();
                        if (adapter2 == null) {
                            l.b();
                        }
                        adapter2.notifyItemChanged(bVar.f84408b.f84402b);
                        bVar.f84408b.f84405e.invoke(b2);
                    }
                }
            });
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: h.f.a.b<? super java.lang.String, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public b(RecyclerView recyclerView, List<String> list, h.f.a.b<? super String, z> bVar) {
        l.d(recyclerView, "");
        l.d(bVar, "");
        this.f84403c = recyclerView;
        this.f84404d = list;
        this.f84405e = bVar;
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        List<String> list2 = this.f84404d;
        if (list2 == null || !(!list2.isEmpty())) {
            recyclerView.setVisibility(8);
        } else if (recyclerView.getAdapter() == null) {
            recyclerView.setAdapter(new a());
        } else {
            RecyclerView.a adapter = recyclerView.getAdapter();
            if (adapter == null) {
                l.b();
            }
            adapter.notifyDataSetChanged();
        }
    }
}
