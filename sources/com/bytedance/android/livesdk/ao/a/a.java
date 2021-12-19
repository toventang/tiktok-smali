package com.bytedance.android.livesdk.ao.a;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.core.widget.h;
import androidx.fragment.app.i;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.live.design.widget.LiveSwitch;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.ao.a.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.a.m;
import h.f.b.l;
import h.m.p;
import h.z;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;

public final class a extends com.bytedance.android.livesdk.ui.a {

    /* renamed from: a  reason: collision with root package name */
    public b f13959a;

    /* renamed from: b  reason: collision with root package name */
    public List<? extends com.bytedance.android.livesdk.ap.b<?>> f13960b;

    /* renamed from: c  reason: collision with root package name */
    private RecyclerView f13961c;

    /* renamed from: d  reason: collision with root package name */
    private LiveEditText f13962d;

    /* renamed from: e  reason: collision with root package name */
    private HashMap f13963e;

    static {
        Covode.recordClassIndex(7749);
    }

    public static final class b extends RecyclerView.a<C0292a> {

        /* renamed from: a  reason: collision with root package name */
        public List<? extends com.bytedance.android.livesdk.ap.b<?>> f13973a;

        /* renamed from: b  reason: collision with root package name */
        public m<? super com.bytedance.android.livesdk.ap.b<?>, ? super Integer, z> f13974b;

        static {
            Covode.recordClassIndex(7753);
        }

        /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final /* synthetic */ C0292a onCreateViewHolder(ViewGroup viewGroup, int i2) {
            return a(this, viewGroup, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final int getItemCount() {
            return this.f13973a.size();
        }

        public b(List<? extends com.bytedance.android.livesdk.ap.b<?>> list, m<? super com.bytedance.android.livesdk.ap.b<?>, ? super Integer, z> mVar) {
            l.d(list, "");
            l.d(mVar, "");
            this.f13973a = list;
            this.f13974b = mVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final /* synthetic */ void onBindViewHolder(C0292a aVar, int i2) {
            Object obj;
            C0292a aVar2 = aVar;
            l.d(aVar2, "");
            com.bytedance.android.livesdk.ap.b bVar = (com.bytedance.android.livesdk.ap.b) this.f13973a.get(i2);
            C0292a.a(aVar2.f13965b, aVar2.f13964a, bVar);
            if (bVar != null) {
                obj = bVar.a();
            } else {
                obj = null;
            }
            if (obj instanceof Boolean) {
                LiveSwitch liveSwitch = aVar2.f13966c;
                if (liveSwitch != null) {
                    liveSwitch.setVisibility(0);
                }
                LiveSwitch liveSwitch2 = aVar2.f13966c;
                if (liveSwitch2 != null) {
                    l.b(bVar, "");
                    Object a2 = bVar.a();
                    Objects.requireNonNull(a2, "null cannot be cast to non-null type kotlin.Boolean");
                    liveSwitch2.setChecked(((Boolean) a2).booleanValue());
                }
                LiveSwitch liveSwitch3 = aVar2.f13966c;
                if (liveSwitch3 != null) {
                    liveSwitch3.setOnCheckedChangeListener(new C0292a.C0293a(aVar2, bVar));
                }
            } else {
                LiveSwitch liveSwitch4 = aVar2.f13966c;
                if (liveSwitch4 != null) {
                    liveSwitch4.setVisibility(8);
                }
            }
            aVar2.itemView.setOnClickListener(new C0292a.b(aVar2, bVar, i2));
        }

        private static RecyclerView.ViewHolder a(b bVar, ViewGroup viewGroup, int i2) {
            boolean a2;
            MethodCollector.i(13261);
            l.d(viewGroup, "");
            View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.ba_, viewGroup, false);
            l.b(a3, "");
            C0292a aVar = new C0292a(a3, bVar.f13974b);
            try {
                if (aVar.itemView.getParent() != null) {
                    try {
                        a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                    } catch (Exception unused) {
                    }
                    if (a2) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(aVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                        com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                        ViewGroup viewGroup2 = (ViewGroup) aVar.itemView.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(aVar.itemView);
                        }
                    }
                }
            } catch (Exception e2) {
                ai.a(e2);
                com.ss.android.ugc.aweme.framework.a.a.a(e2);
            }
            gg.f143005a = aVar.getClass().getName();
            MethodCollector.o(13261);
            return aVar;
        }
    }

    static final class d extends h.f.b.m implements m<com.bytedance.android.livesdk.ap.b<?>, Integer, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(7755);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* renamed from: com.bytedance.android.livesdk.ao.a.a$d$a  reason: collision with other inner class name */
        static final class C0294a extends h.f.b.m implements h.f.a.a<z> {
            final /* synthetic */ int $position$inlined;
            final /* synthetic */ com.bytedance.android.livesdk.ap.b $property$inlined;
            final /* synthetic */ d this$0;

            static {
                Covode.recordClassIndex(7756);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0294a(d dVar, com.bytedance.android.livesdk.ap.b bVar, int i2) {
                super(0);
                this.this$0 = dVar;
                this.$property$inlined = bVar;
                this.$position$inlined = i2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                b bVar = this.this$0.this$0.f13959a;
                if (bVar != null) {
                    bVar.notifyItemChanged(this.$position$inlined);
                }
                return z.f158842a;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.android.livesdk.ap.b<?> bVar, Integer num) {
            i fragmentManager;
            com.bytedance.android.livesdk.ap.b<?> bVar2 = bVar;
            int intValue = num.intValue();
            l.d(bVar2, "");
            if (!(bVar2.a() instanceof Boolean) && (fragmentManager = this.this$0.getFragmentManager()) != null) {
                l.b(fragmentManager, "");
                C0294a aVar = new C0294a(this, bVar2, intValue);
                l.d(fragmentManager, "");
                l.d(bVar2, "");
                l.d(aVar, "");
                b.f13977d = bVar2;
                b bVar3 = new b();
                bVar3.show(fragmentManager, "KevaTestDialog");
                bVar3.f13979a = new b.a.C0295a(bVar2, aVar, bVar3);
                bVar3.e();
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f13963e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public a() {
        ArrayList arrayList = new ArrayList();
        Field[] declaredFields = com.bytedance.android.livesdk.ap.a.class.getDeclaredFields();
        for (Field field : declaredFields) {
            l.b(field, "");
            field.setAccessible(true);
            Object obj = field.get(com.bytedance.android.livesdk.ap.a.class);
            if (obj instanceof com.bytedance.android.livesdk.ap.b) {
                com.bytedance.android.livesdk.ao.c cVar = (com.bytedance.android.livesdk.ao.c) obj;
                arrayList.add(new com.bytedance.android.livesdk.ap.b(cVar.f13991a, cVar.a()));
            }
        }
        this.f13960b = arrayList;
    }

    public static final class c implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f13975a;

        static {
            Covode.recordClassIndex(7754);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(a aVar) {
            this.f13975a = aVar;
        }

        public final void afterTextChanged(Editable editable) {
            String str;
            if (editable != null) {
                String valueOf = String.valueOf(editable);
                Objects.requireNonNull(valueOf, "null cannot be cast to non-null type kotlin.CharSequence");
                String obj = p.b((CharSequence) valueOf).toString();
                List<? extends com.bytedance.android.livesdk.ap.b<?>> list = this.f13975a.f13960b;
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = list.iterator();
                while (true) {
                    str = "";
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    Pattern compile = Pattern.compile("(?i)".concat(String.valueOf(obj)));
                    String str2 = next.f13991a;
                    if (str2 != null) {
                        str = str2;
                    }
                    if (compile.matcher(str).find()) {
                        arrayList.add(next);
                    }
                }
                ArrayList arrayList2 = arrayList;
                b bVar = this.f13975a.f13959a;
                if (bVar != null) {
                    l.d(arrayList2, str);
                    bVar.f13973a = arrayList2;
                    bVar.notifyDataSetChanged();
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.ao.a.a$a  reason: collision with other inner class name */
    public static final class C0292a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public final LiveTextView f13964a;

        /* renamed from: b  reason: collision with root package name */
        public final LiveTextView f13965b;

        /* renamed from: c  reason: collision with root package name */
        final LiveSwitch f13966c;

        /* renamed from: d  reason: collision with root package name */
        public m<? super com.bytedance.android.livesdk.ap.b<?>, ? super Integer, z> f13967d;

        static {
            Covode.recordClassIndex(7750);
        }

        /* renamed from: com.bytedance.android.livesdk.ao.a.a$a$b */
        static final class b implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C0292a f13970a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ com.bytedance.android.livesdk.ap.b f13971b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f13972c;

            static {
                Covode.recordClassIndex(7752);
            }

            b(C0292a aVar, com.bytedance.android.livesdk.ap.b bVar, int i2) {
                this.f13970a = aVar;
                this.f13971b = bVar;
                this.f13972c = i2;
            }

            public final void onClick(View view) {
                com.bytedance.android.livesdk.ap.b bVar = this.f13971b;
                if (bVar != null) {
                    this.f13970a.f13967d.invoke(bVar, Integer.valueOf(this.f13972c));
                }
            }
        }

        /* renamed from: com.bytedance.android.livesdk.ao.a.a$a$a  reason: collision with other inner class name */
        static final class C0293a implements CompoundButton.OnCheckedChangeListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C0292a f13968a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ com.bytedance.android.livesdk.ap.b f13969b;

            static {
                Covode.recordClassIndex(7751);
            }

            C0293a(C0292a aVar, com.bytedance.android.livesdk.ap.b bVar) {
                this.f13968a = aVar;
                this.f13969b = bVar;
            }

            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                com.bytedance.android.livesdk.ap.b bVar = this.f13969b;
                l.b(bVar, "");
                com.bytedance.android.livesdk.ap.c.a(bVar, Boolean.valueOf(z));
                C0292a.a(this.f13968a.f13965b, this.f13968a.f13964a, this.f13969b);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0292a(View view, m<? super com.bytedance.android.livesdk.ap.b<?>, ? super Integer, z> mVar) {
            super(view);
            l.d(view, "");
            l.d(mVar, "");
            this.f13967d = mVar;
            this.f13964a = (LiveTextView) view.findViewById(R.id.f1_);
            this.f13965b = (LiveTextView) view.findViewById(R.id.f_e);
            this.f13966c = (LiveSwitch) view.findViewById(R.id.bsw);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.lang.Object */
        /* JADX WARN: Multi-variable type inference failed */
        public static void a(LiveTextView liveTextView, LiveTextView liveTextView2, com.bytedance.android.livesdk.ap.b<?> bVar) {
            Object obj;
            Object a2;
            String str;
            Object a3;
            Class<?> cls;
            String cls2;
            List<String> b2;
            Object obj2 = null;
            if (bVar == null || (a3 = bVar.a()) == null || (cls = a3.getClass()) == null || (cls2 = cls.toString()) == null || (b2 = p.b(cls2, new String[]{"."})) == null) {
                obj = null;
            } else {
                obj = n.i((List) b2);
            }
            String str2 = "";
            if (liveTextView2 != null) {
                Object[] objArr = new Object[1];
                if (bVar == null || (str = bVar.f13991a) == null) {
                    str = str2;
                }
                objArr[0] = str;
                liveTextView2.setText(y.a((int) R.string.gym, objArr));
            }
            if (bVar != null) {
                obj2 = bVar.a();
            }
            if (obj2 instanceof String) {
                l.b(bVar, str2);
                if (bVar.a().toString().length() > 100) {
                    String obj3 = bVar.a().toString();
                    Objects.requireNonNull(obj3, "null cannot be cast to non-null type java.lang.String");
                    String substring = obj3.substring(0, 100);
                    l.b(substring, str2);
                    if (liveTextView != null) {
                        liveTextView.setText(y.a((int) R.string.gyn, obj, substring));
                        return;
                    }
                    return;
                }
            }
            if (liveTextView != null) {
                Object[] objArr2 = new Object[2];
                objArr2[0] = obj;
                if (!(bVar == null || (a2 = bVar.a()) == 0)) {
                    str2 = a2;
                }
                objArr2[1] = str2;
                liveTextView.setText(y.a((int) R.string.gyn, objArr2));
            }
        }
    }

    @Override // com.bytedance.android.livesdk.ui.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        if (this.f13962d == null) {
            this.f13962d = (LiveEditText) view.findViewWithTag("search_view");
        }
        LiveEditText liveEditText = this.f13962d;
        if (liveEditText != null) {
            liveEditText.addTextChangedListener(new c(this));
        }
        if (this.f13961c == null) {
            this.f13961c = (RecyclerView) view.findViewWithTag("recycler_view");
        }
        this.f13959a = new b(this.f13960b, new d(this));
        RecyclerView recyclerView = this.f13961c;
        if (recyclerView != null) {
            getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        }
        RecyclerView recyclerView2 = this.f13961c;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.f13959a);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        MethodCollector.i(13341);
        l.d(layoutInflater, "");
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setBackground(y.c(R.drawable.brp));
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        LiveTextView liveTextView = new LiveTextView(layoutInflater.getContext());
        h.a(liveTextView, (int) R.style.k6);
        liveTextView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        liveTextView.setPadding(y.a(16.0f), y.a(8.0f), y.a(16.0f), y.a(8.0f));
        liveTextView.setText(y.a((int) R.string.gyq));
        liveTextView.setBackgroundColor(Color.parseColor("#55112233"));
        liveTextView.setTextColor(-1);
        linearLayout.addView(liveTextView);
        LiveEditText liveEditText = new LiveEditText(layoutInflater.getContext());
        this.f13962d = liveEditText;
        h.a(liveEditText, (int) R.style.k9);
        liveEditText.setTag("search_view");
        liveEditText.setLayoutParams(new LinearLayout.LayoutParams(-1, y.a(50.0f)));
        liveEditText.setPadding(y.a(16.0f), 0, y.a(16.0f), 0);
        liveEditText.setMaxLines(1);
        liveEditText.setGravity(16);
        liveEditText.setHint("input search keywords");
        liveEditText.setSingleLine();
        liveEditText.setFocusable(true);
        liveEditText.setFocusableInTouchMode(true);
        linearLayout.addView(this.f13962d);
        liveEditText.setBackgroundColor(com.bytedance.android.live.design.b.a(liveEditText, (int) R.attr.al6));
        liveEditText.setImeOptions(3);
        liveEditText.requestFocus();
        RecyclerView recyclerView2 = new RecyclerView(layoutInflater.getContext());
        this.f13961c = recyclerView2;
        recyclerView2.setTag("recycler_view");
        RecyclerView recyclerView3 = this.f13961c;
        if (recyclerView3 != null) {
            recyclerView3.setScrollBarSize(y.a(3.0f));
        }
        if (Build.VERSION.SDK_INT >= 29 && (recyclerView = this.f13961c) != null) {
            recyclerView.setVerticalScrollbarThumbDrawable(new ColorDrawable(-7829368));
        }
        RecyclerView recyclerView4 = this.f13961c;
        if (recyclerView4 != null) {
            recyclerView4.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        }
        linearLayout.addView(this.f13961c);
        MethodCollector.o(13341);
        return linearLayout;
    }
}
