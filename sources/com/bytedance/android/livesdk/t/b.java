package com.bytedance.android.livesdk.t;

import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.HashtagResponse;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.core.widget.StateLayout;
import com.bytedance.android.live.design.widget.LiveButton;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.live.design.widget.LiveRadioButton;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.hashtag.HashtagApi;
import com.bytedance.android.livesdk.j.cs;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.utils.o;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdk.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class b extends v {

    /* renamed from: b  reason: collision with root package name */
    public static final a f21626b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public C0477b f21627a;

    /* renamed from: c  reason: collision with root package name */
    private boolean f21628c;

    /* renamed from: d  reason: collision with root package name */
    private HashMap f21629d;

    /* renamed from: com.bytedance.android.livesdk.t.b$b  reason: collision with other inner class name */
    public static final class C0477b extends RecyclerView.a<RecyclerView.ViewHolder> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f21630c = new a((byte) 0);

        /* renamed from: a  reason: collision with root package name */
        public GameTag f21631a;

        /* renamed from: b  reason: collision with root package name */
        public final List<GameTag> f21632b;

        /* renamed from: d  reason: collision with root package name */
        private List<GameTag> f21633d;

        /* renamed from: e  reason: collision with root package name */
        private String f21634e = "";

        /* renamed from: f  reason: collision with root package name */
        private boolean f21635f;

        /* renamed from: g  reason: collision with root package name */
        private final h.f.a.m<GameTag, Integer, z> f21636g;

        /* renamed from: h  reason: collision with root package name */
        private final LiveEditText f21637h;

        static {
            Covode.recordClassIndex(12760);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
            return a(viewGroup, i2);
        }

        /* renamed from: com.bytedance.android.livesdk.t.b$b$a */
        public static final class a {
            static {
                Covode.recordClassIndex(12761);
            }

            private a() {
            }

            public /* synthetic */ a(byte b2) {
                this();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final int getItemCount() {
            int i2 = 0;
            if (this.f21635f) {
                List<GameTag> list = this.f21633d;
                if (list != null) {
                    return list.size();
                }
                return 0;
            }
            List<GameTag> list2 = this.f21633d;
            if (list2 != null) {
                i2 = list2.size();
            }
            return i2 + 1;
        }

        public final void a() {
            List<GameTag> list = this.f21633d;
            if (list != null) {
                int i2 = 0;
                for (T t : list) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        n.a();
                    }
                    T t2 = t;
                    if (t2.getSelected()) {
                        this.f21631a = t2;
                        this.f21636g.invoke(t2, Integer.valueOf(i3));
                    }
                    i2 = i3;
                }
            }
        }

        public final void b() {
            Integer valueOf;
            List<GameTag> list = this.f21632b;
            if (list != null) {
                int i2 = 0;
                for (T t : list) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        n.a();
                    }
                    T t2 = t;
                    if (t2.getSelected()) {
                        t2.setSelected(false);
                        List<GameTag> list2 = this.f21633d;
                        if (!(list2 == null || (valueOf = Integer.valueOf(list2.indexOf(t2))) == null)) {
                            int intValue = valueOf.intValue();
                            if (!this.f21635f) {
                                intValue++;
                            }
                            notifyItemChanged(intValue);
                        }
                    }
                    i2 = i3;
                }
            }
        }

        private final int b(int i2) {
            if (this.f21635f) {
                return i2;
            }
            return i2 - 1;
        }

        /* renamed from: com.bytedance.android.livesdk.t.b$b$b  reason: collision with other inner class name */
        static final class View$OnClickListenerC0478b implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C0477b f21638a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f21639b;

            static {
                Covode.recordClassIndex(12762);
            }

            View$OnClickListenerC0478b(C0477b bVar, int i2) {
                this.f21638a = bVar;
                this.f21639b = i2;
            }

            public final void onClick(View view) {
                this.f21638a.b();
                this.f21638a.a(this.f21639b);
            }
        }

        /* renamed from: com.bytedance.android.livesdk.t.b$b$c */
        static final class c implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C0477b f21640a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f21641b;

            static {
                Covode.recordClassIndex(12763);
            }

            c(C0477b bVar, int i2) {
                this.f21640a = bVar;
                this.f21641b = i2;
            }

            public final void onClick(View view) {
                this.f21640a.b();
                this.f21640a.a(this.f21641b);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final int getItemViewType(int i2) {
            if (this.f21635f || i2 != 0) {
                return 1;
            }
            return 0;
        }

        public final void a(int i2) {
            List<GameTag> list;
            GameTag gameTag;
            if (i2 >= 0 && (list = this.f21633d) != null && (gameTag = list.get(b(i2))) != null) {
                gameTag.setSelected(true);
                notifyItemChanged(i2);
                this.f21631a = gameTag;
                LiveEditText liveEditText = this.f21637h;
                if (liveEditText != null && liveEditText.isFocusable()) {
                    this.f21637h.clearFocus();
                }
            }
        }

        private static RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
            RecyclerView.ViewHolder viewHolder;
            boolean a2;
            MethodCollector.i(2303);
            h.f.b.l.d(viewGroup, "");
            if (i2 == 0) {
                View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.b6k, viewGroup, false);
                h.f.b.l.b(a3, "");
                viewHolder = new d(a3);
            } else {
                View a4 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.b6j, viewGroup, false);
                h.f.b.l.b(a4, "");
                viewHolder = new c(a4);
            }
            try {
                if (viewHolder.itemView.getParent() != null) {
                    try {
                        a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                    } catch (Exception unused) {
                    }
                    if (a2) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(viewHolder.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                        com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                        ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(viewHolder.itemView);
                        }
                    }
                }
            } catch (Exception e2) {
                ai.a(e2);
                com.ss.android.ugc.aweme.framework.a.a.a(e2);
            }
            gg.f143005a = viewHolder.getClass().getName();
            MethodCollector.o(2303);
            return viewHolder;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
            GameTag gameTag;
            int a2;
            String str;
            String str2 = "";
            h.f.b.l.d(viewHolder, str2);
            boolean z = false;
            if (viewHolder instanceof c) {
                c cVar = (c) viewHolder;
                int adapterPosition = cVar.getAdapterPosition();
                List<GameTag> list = this.f21633d;
                if (list != null) {
                    gameTag = list.get(b(adapterPosition));
                } else {
                    gameTag = null;
                }
                int adapterPosition2 = cVar.getAdapterPosition();
                h.f.a.m<GameTag, Integer, z> mVar = this.f21636g;
                String str3 = this.f21634e;
                h.f.b.l.d(mVar, str2);
                h.f.b.l.d(str3, str2);
                if (!(gameTag == null || (str = gameTag.showName) == null)) {
                    str2 = str;
                }
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
                if (p.a((CharSequence) str3) && str2.length() > 0 && (a2 = h.m.p.a((CharSequence) str2, str3, 0, true)) >= 0) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#FF4C3A")), a2, str3.length() + a2, 34);
                }
                cVar.f21642a.setText(spannableStringBuilder);
                if (gameTag != null) {
                    z = gameTag.getSelected();
                }
                cVar.f21643b.setChecked(z);
                if (z) {
                    if (gameTag == null) {
                        h.f.b.l.b();
                    }
                    mVar.invoke(gameTag, Integer.valueOf(adapterPosition2));
                }
                viewHolder.itemView.setOnClickListener(new View$OnClickListenerC0478b(this, adapterPosition));
                cVar.f21643b.setOnClickListener(new c(this, adapterPosition));
            } else if (viewHolder instanceof d) {
                d dVar = (d) viewHolder;
                List<GameTag> list2 = this.f21633d;
                if (list2 == null || !a.a(list2)) {
                    dVar.f21644a.setText(y.a((int) R.string.eaq));
                } else {
                    dVar.f21644a.setText(y.a((int) R.string.eao));
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.m<? super com.bytedance.android.livesdk.model.GameTag, ? super java.lang.Integer, h.z> */
        /* JADX WARN: Multi-variable type inference failed */
        public C0477b(h.f.a.m<? super GameTag, ? super Integer, z> mVar, List<GameTag> list, LiveEditText liveEditText) {
            h.f.b.l.d(mVar, "");
            this.f21636g = mVar;
            this.f21632b = list;
            this.f21637h = liveEditText;
            this.f21633d = list;
        }

        public final void a(List<GameTag> list, String str, boolean z) {
            h.f.b.l.d(str, "");
            this.f21633d = list;
            this.f21634e = str;
            this.f21635f = z;
            notifyDataSetChanged();
            a();
        }
    }

    static {
        Covode.recordClassIndex(12758);
    }

    @Override // com.bytedance.android.livesdk.v
    public final void a() {
        HashMap hashMap = this.f21629d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final View a_(int i2) {
        if (this.f21629d == null) {
            this.f21629d = new HashMap();
        }
        View view = (View) this.f21629d.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f21629d.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(12759);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(androidx.fragment.app.i iVar, boolean z) {
            Fragment fragment;
            h.f.b.l.d("GameCategoryListDialog", "");
            if (iVar != null) {
                fragment = iVar.a("GameCategoryListDialog");
            } else {
                fragment = null;
            }
            if (fragment instanceof androidx.fragment.app.d) {
                ((androidx.fragment.app.d) fragment).dismiss();
            }
            if (iVar != null) {
                b bVar = new b();
                Bundle bundle = new Bundle();
                bundle.putBoolean("key_auto_open_from_topic", z);
                bVar.setArguments(bundle);
                bVar.show(iVar, "GameCategoryListDialog");
            }
        }
    }

    static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f21645a;

        static {
            Covode.recordClassIndex(12766);
        }

        e(b bVar) {
            this.f21645a = bVar;
        }

        private static boolean a() {
            try {
                return f.a.f68431a.c();
            } catch (Exception unused) {
                return false;
            }
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.android.live.network.response.d dVar = (com.bytedance.android.live.network.response.d) obj;
            this.f21645a.getContext();
            if (!com.ss.android.ugc.aweme.lancet.j.f107226e || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
                com.ss.android.ugc.aweme.lancet.j.f107226e = a();
            }
            LinkedHashMap linkedHashMap = null;
            if (!com.ss.android.ugc.aweme.lancet.j.f107226e) {
                this.f21645a.a(1, null);
                return;
            }
            List<GameTag> list = ((HashtagResponse) dVar.data).gameTagList;
            com.bytedance.android.livesdk.ap.b<Map<String, String>> bVar = com.bytedance.android.livesdk.ap.a.cO;
            String str = "";
            h.f.b.l.b(bVar, str);
            Hashtag hashtag = ((HashtagResponse) dVar.data).gameHashTag;
            if (hashtag != null) {
                linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("key_id", String.valueOf(hashtag.id));
                String str2 = hashtag.title;
                if (str2 != null) {
                    str = str2;
                }
                linkedHashMap.put("key_title", str);
            }
            com.bytedance.android.livesdk.ap.c.a(bVar, linkedHashMap);
            this.f21645a.a(0, list);
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final v.b b() {
        v.b bVar = new v.b(R.layout.b6g);
        bVar.f22385l = 48;
        bVar.f22380g = 80;
        bVar.f22381h = -1;
        bVar.f22383j = 73;
        return bVar;
    }

    static final class j implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f21650a;

        static {
            Covode.recordClassIndex(12771);
        }

        j(b bVar) {
            this.f21650a = bVar;
        }

        public final void onClick(View view) {
            this.f21650a.dismiss();
        }
    }

    public static final class m implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f21653a;

        static {
            Covode.recordClassIndex(12775);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        m(b bVar) {
            this.f21653a = bVar;
        }

        private final void a(boolean z) {
            if (z) {
                LinearLayout linearLayout = (LinearLayout) this.f21653a.a_(R.id.cgj);
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                    return;
                }
                return;
            }
            LinearLayout linearLayout2 = (LinearLayout) this.f21653a.a_(R.id.cgj);
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
            }
        }

        public final void afterTextChanged(Editable editable) {
            String str;
            List<GameTag> list;
            boolean z;
            com.bytedance.android.live.core.c.a.a(4, "GameCategoryListDialog", "afterTextChanged.");
            Drawable a2 = androidx.core.content.a.f.a(this.f21653a.getResources(), 2131234289, null);
            Drawable a3 = androidx.core.content.a.f.a(this.f21653a.getResources(), 2131234286, null);
            if (editable == null || (str = editable.toString()) == null) {
                str = "";
            }
            Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
            String obj = h.m.p.b((CharSequence) str).toString();
            C0477b bVar = this.f21653a.f21627a;
            if (bVar != null) {
                list = bVar.f21632b;
            } else {
                list = null;
            }
            boolean z2 = true;
            if (list != null) {
                h.f.b.l.d(list, "");
                h.f.b.l.d(obj, "");
                List<GameTag> b2 = b(a(list, obj), obj);
                boolean a4 = a.a(b2);
                if (a4) {
                    a(true);
                } else {
                    a(false);
                }
                if (obj.length() <= 0 || a4) {
                    z = false;
                } else {
                    z = true;
                }
                C0477b bVar2 = this.f21653a.f21627a;
                if (bVar2 != null) {
                    bVar2.a(b2, obj, z);
                }
            }
            if (editable != null && !h.m.p.a(editable)) {
                z2 = false;
            }
            if (!z2) {
                ((LiveEditText) this.f21653a.a_(R.id.ay4)).setCompoundDrawablesRelativeWithIntrinsicBounds(a2, (Drawable) null, a3, (Drawable) null);
            } else {
                ((LiveEditText) this.f21653a.a_(R.id.ay4)).setCompoundDrawablesRelativeWithIntrinsicBounds(a2, (Drawable) null, (Drawable) null, (Drawable) null);
            }
        }

        private static List<GameTag> b(List<GameTag> list, String str) {
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                T t2 = t;
                if (a.a(list)) {
                    if (!t2.isNonGameOrOtherGameItem()) {
                    }
                } else if ((!h.m.p.a((CharSequence) str)) && t2.isNonGameOrOtherGameItem()) {
                }
                arrayList.add(t);
            }
            return arrayList;
        }

        private static List<GameTag> a(List<GameTag> list, String str) {
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                T t2 = t;
                Pattern compile = Pattern.compile("(?i)".concat(String.valueOf(str)));
                String str2 = t2.showName;
                String str3 = "";
                if (str2 == null) {
                    str2 = str3;
                }
                Matcher matcher = compile.matcher(str2);
                String str4 = t2.fullName;
                if (str4 == null) {
                    str4 = str3;
                }
                Matcher matcher2 = compile.matcher(str4);
                String str5 = t2.shortName;
                if (str5 != null) {
                    str3 = str5;
                }
                Matcher matcher3 = compile.matcher(str3);
                if (matcher.find() || matcher2.find() || matcher3.find() || t2.isNonGameOrOtherGameItem()) {
                    arrayList.add(t);
                }
            }
            return arrayList;
        }
    }

    public static final class d extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        final LiveTextView f21644a;

        static {
            Covode.recordClassIndex(12765);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(View view) {
            super(view);
            h.f.b.l.d(view, "");
            View findViewById = view.findViewById(R.id.f8c);
            h.f.b.l.b(findViewById, "");
            this.f21644a = (LiveTextView) findViewById;
        }
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            z = arguments.getBoolean("key_auto_open_from_topic");
        } else {
            z = false;
        }
        this.f21628c = z;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater cloneInContext = super.onGetLayoutInflater(bundle).cloneInContext(com.bytedance.android.live.design.a.a.a(getActivity()));
        h.f.b.l.b(cloneInContext, "");
        return cloneInContext;
    }

    public static final class c extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        final LiveTextView f21642a;

        /* renamed from: b  reason: collision with root package name */
        public final LiveRadioButton f21643b;

        static {
            Covode.recordClassIndex(12764);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(View view) {
            super(view);
            h.f.b.l.d(view, "");
            View findViewById = view.findViewById(R.id.ezv);
            h.f.b.l.b(findViewById, "");
            this.f21642a = (LiveTextView) findViewById;
            View findViewById2 = view.findViewById(R.id.ezw);
            h.f.b.l.b(findViewById2, "");
            this.f21643b = (LiveRadioButton) findViewById2;
        }
    }

    static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f21646a;

        static {
            Covode.recordClassIndex(12767);
        }

        f(b bVar) {
            this.f21646a = bVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f21646a.a(1, null);
            com.bytedance.android.live.core.c.a.a(4, "GameCategoryListDialog", "fetchGameList. onError. error=" + ((Throwable) obj).getMessage());
        }
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        com.bytedance.android.livesdk.ap.b<Map<String, String>> bVar = com.bytedance.android.livesdk.ap.a.cN;
        h.f.b.l.b(bVar, "");
        GameTag a2 = GameTag.a.a(bVar.a());
        if (!this.f21628c) {
            return;
        }
        if (a2 == null || a2.isNonGameItem()) {
            GameTag a3 = a.a();
            Map<String, String> a4 = GameTag.a.a(a3);
            com.bytedance.android.livesdk.ap.b<Map<String, String>> bVar2 = com.bytedance.android.livesdk.ap.a.cN;
            h.f.b.l.b(bVar2, "");
            com.bytedance.android.livesdk.ap.c.a(bVar2, a4);
            DataChannel dataChannel = this.p;
            if (dataChannel != null) {
                dataChannel.b(cs.class, a3);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g implements View.OnFocusChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f21647a;

        static {
            Covode.recordClassIndex(12768);
        }

        g(b bVar) {
            this.f21647a = bVar;
        }

        public final void onFocusChange(View view, boolean z) {
            com.bytedance.android.live.core.c.a.a(4, "GameCategoryListDialog", "et_search onFocusChanged. hasFocus=".concat(String.valueOf(z)));
            if (!z) {
                LiveEditText liveEditText = (LiveEditText) this.f21647a.a_(R.id.ay4);
                h.f.b.l.b(liveEditText, "");
                o.b(liveEditText.getContext(), (EditText) this.f21647a.a_(R.id.ay4));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f21649a;

        static {
            Covode.recordClassIndex(12770);
        }

        i(b bVar) {
            this.f21649a = bVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (view == null || motionEvent == null) {
                return false;
            }
            if (motionEvent.getAction() != 2 && motionEvent.getAction() != 1) {
                return false;
            }
            LiveEditText liveEditText = (LiveEditText) this.f21649a.a_(R.id.ay4);
            h.f.b.l.b(liveEditText, "");
            if (!liveEditText.isFocusable()) {
                return false;
            }
            ((LiveEditText) this.f21649a.a_(R.id.ay4)).clearFocus();
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k extends h.f.b.m implements h.f.a.m<GameTag, Integer, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(12772);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(GameTag gameTag, Integer num) {
            int intValue = num.intValue();
            h.f.b.l.d(gameTag, "");
            com.bytedance.android.live.core.c.a.a(4, "GameCategoryListDialog", "select item callback. gameItem=".concat(String.valueOf(gameTag)));
            LiveButton liveButton = (LiveButton) this.this$0.a_(R.id.yi);
            if (liveButton != null) {
                liveButton.setEnabled(true);
            }
            LiveButton liveButton2 = (LiveButton) this.this$0.a_(R.id.yi);
            if (liveButton2 != null) {
                liveButton2.setOnClickListener(new View.OnClickListener(this) {
                    /* class com.bytedance.android.livesdk.t.b.k.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ k f21651a;

                    static {
                        Covode.recordClassIndex(12773);
                    }

                    {
                        this.f21651a = r1;
                    }

                    public final void onClick(View view) {
                        GameTag gameTag;
                        C0477b bVar = this.f21651a.this$0.f21627a;
                        if (bVar != null && (gameTag = bVar.f21631a) != null) {
                            Map<String, String> a2 = GameTag.a.a(gameTag);
                            com.bytedance.android.livesdk.ap.b<Map<String, String>> bVar2 = com.bytedance.android.livesdk.ap.a.cN;
                            h.f.b.l.b(bVar2, "");
                            com.bytedance.android.livesdk.ap.c.a(bVar2, a2);
                            DataChannel dataChannel = this.f21651a.this$0.p;
                            if (dataChannel != null) {
                                dataChannel.b(cs.class, gameTag);
                            }
                            this.f21651a.this$0.dismiss();
                        }
                    }
                });
            }
            RecyclerView recyclerView = (RecyclerView) this.this$0.a_(R.id.drd);
            if (recyclerView != null) {
                recyclerView.b(intValue);
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        LiveEditText liveEditText = (LiveEditText) a_(R.id.ay4);
        if (liveEditText != null) {
            liveEditText.setEnabled(false);
        }
        StateLayout stateLayout = (StateLayout) a_(R.id.b_p);
        if (stateLayout != null) {
            stateLayout.a("LOADING");
        }
        ((HashtagApi) com.bytedance.android.live.network.e.a().a(HashtagApi.class)).fetchHashtagList().a(new com.bytedance.android.livesdk.util.rxutils.f()).a(com.bytedance.android.livesdk.util.rxutils.i.a(this, com.bytedance.android.livesdk.util.rxutils.b.b.DESTROY)).a(new e(this), new f(this));
        ImageView imageView = (ImageView) a_(R.id.bve);
        if (imageView != null) {
            imageView.setOnClickListener(new j(this));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f21648a;

        static {
            Covode.recordClassIndex(12769);
        }

        h(b bVar) {
            this.f21648a = bVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0080, code lost:
            if (r7 > ((float) (r1 + r0.getHeight()))) goto L_0x0021;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
            /*
            // Method dump skipped, instructions count: 131
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.t.b.h.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class l implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f21652a;

        static {
            Covode.recordClassIndex(12774);
        }

        l(b bVar) {
            this.f21652a = bVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x00bb, code lost:
            if (r2 >= ((float) (r1 - r0.getPaddingEnd()))) goto L_0x0060;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x005e, code lost:
            if (r5 <= ((float) (r2 - (r1 - r0.getPaddingEnd())))) goto L_0x0060;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onTouch(android.view.View r9, android.view.MotionEvent r10) {
            /*
            // Method dump skipped, instructions count: 190
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.t.b.l.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    }

    public final void a(int i2, List<GameTag> list) {
        ((StateLayout) a_(R.id.b_p)).a("CONTENT");
        if (i2 == 0) {
            LinearLayout linearLayout = (LinearLayout) a_(R.id.cfc);
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            LiveEditText liveEditText = (LiveEditText) a_(R.id.ay4);
            if (liveEditText != null) {
                liveEditText.setEnabled(true);
            }
            LiveEditText liveEditText2 = (LiveEditText) a_(R.id.ay4);
            if (liveEditText2 != null) {
                liveEditText2.setOnFocusChangeListener(new g(this));
            }
        } else if (i2 == 1) {
            LinearLayout linearLayout2 = (LinearLayout) a_(R.id.cfc);
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(0);
            }
            LiveEditText liveEditText3 = (LiveEditText) a_(R.id.ay4);
            if (liveEditText3 != null) {
                liveEditText3.setEnabled(false);
            }
        }
        if (list == null) {
            list = new ArrayList<>();
        }
        this.f21627a = new C0477b(new k(this), a.a(this.f21628c, n.g((Collection) list)), (LiveEditText) a_(R.id.ay4));
        RecyclerView recyclerView = (RecyclerView) a_(R.id.drd);
        if (recyclerView != null) {
            getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager());
        }
        RecyclerView recyclerView2 = (RecyclerView) a_(R.id.drd);
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(this.f21627a);
        }
        C0477b bVar = this.f21627a;
        if (bVar != null) {
            bVar.a();
        }
        LiveEditText liveEditText4 = (LiveEditText) a_(R.id.ay4);
        if (liveEditText4 != null) {
            liveEditText4.addTextChangedListener(new m(this));
        }
        LiveEditText liveEditText5 = (LiveEditText) a_(R.id.ay4);
        if (liveEditText5 != null) {
            liveEditText5.setOnTouchListener(new l(this));
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) a_(R.id.a6l);
        if (constraintLayout != null) {
            constraintLayout.setOnTouchListener(new h(this));
        }
        RecyclerView recyclerView3 = (RecyclerView) a_(R.id.drd);
        if (recyclerView3 != null) {
            recyclerView3.setOnTouchListener(new i(this));
        }
    }
}
