package com.bytedance.android.live.broadcast.api.blockword;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.android.live.broadcast.api.blockword.a;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.core.widget.FitTextView;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.utils.ao;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.lancet.j;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.m.p;
import h.z;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class BlockWordView extends FrameLayout implements a.AbstractC0101a {

    /* renamed from: e  reason: collision with root package name */
    public static final a f7481e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final a f7482a;

    /* renamed from: b  reason: collision with root package name */
    InputFilter.LengthFilter f7483b;

    /* renamed from: c  reason: collision with root package name */
    public int f7484c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f7485d;

    /* renamed from: f  reason: collision with root package name */
    private long f7486f;

    /* renamed from: g  reason: collision with root package name */
    private final TextWatcher f7487g;

    /* renamed from: h  reason: collision with root package name */
    private final TextView.OnEditorActionListener f7488h;

    /* renamed from: i  reason: collision with root package name */
    private HashMap f7489i;

    static {
        Covode.recordClassIndex(3679);
    }

    public BlockWordView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final View a(int i2) {
        if (this.f7489i == null) {
            this.f7489i = new HashMap();
        }
        View view = (View) this.f7489i.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f7489i.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.android.live.broadcast.api.blockword.a.AbstractC0101a
    public final void b(Throwable th) {
        l.d(th, "");
    }

    @Override // com.bytedance.android.live.broadcast.api.blockword.a.AbstractC0101a
    public final void c(Throwable th) {
        l.d(th, "");
    }

    public static final class a {
        static {
            Covode.recordClassIndex(3680);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void a(boolean z, String str, long j2, String str2) {
        l.d(str, "");
        l.d(str2, "");
        a aVar = this.f7482a;
        l.d(str, "");
        l.d(str2, "");
        aVar.f7503c = z;
        aVar.f7504d = str;
        aVar.f7505e = j2;
        aVar.f7502b = str2;
        a aVar2 = this.f7482a;
        aVar2.f7501a.getBlockWord(aVar2.f7504d.toString(), aVar2.f7505e).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(new a.f(aVar2), new a.g(aVar2));
    }

    static final class c implements TextView.OnEditorActionListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BlockWordView f7490a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f7491b;

        static {
            Covode.recordClassIndex(3682);
        }

        c(BlockWordView blockWordView, Context context) {
            this.f7490a = blockWordView;
            this.f7491b = context;
        }

        private static boolean a() {
            try {
                return f.a.f68431a.c();
            } catch (Exception unused) {
                return false;
            }
        }

        public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
            String str;
            if (i2 != 4) {
                return false;
            }
            if (!j.f107226e || !j.b() || j.c()) {
                j.f107226e = a();
            }
            if (!j.f107226e) {
                ao.a(y.e(), (int) R.string.efp);
                return false;
            }
            l.b(textView, "");
            String obj = textView.getText().toString();
            if (p.a((CharSequence) obj)) {
                ao.a(y.e(), (int) R.string.e_k);
                return false;
            }
            a aVar = this.f7490a.f7482a;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.CharSequence");
            com.bytedance.android.live.broadcast.api.blockword.model.a aVar2 = new com.bytedance.android.live.broadcast.api.blockword.model.a(p.b((CharSequence) obj).toString());
            l.d(aVar2, "");
            com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_tns_add_keywords");
            String str2 = aVar.f7502b;
            if (str2 == null) {
                l.a("eventPage");
            }
            com.bytedance.android.livesdk.ab.b a3 = a2.d(str2).a("keyword", aVar2.f7520b).a("timestamp", System.currentTimeMillis());
            if (aVar.f7503c) {
                str = "host";
            } else {
                str = "moderator";
            }
            a3.a("modified_by", str).b();
            aVar.f7501a.addBlockWord(aVar2.f7520b, aVar.f7504d, aVar.f7505e).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(new a.b(aVar, aVar2), new a.c(aVar, aVar2));
            textView.setText("");
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BlockWordView f7493a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ EditText f7494b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f7495c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f7496d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f7497e;

        static {
            Covode.recordClassIndex(3684);
        }

        e(BlockWordView blockWordView, EditText editText, long j2, int i2, int i3) {
            this.f7493a = blockWordView;
            this.f7494b = editText;
            this.f7495c = j2;
            this.f7496d = i2;
            this.f7497e = i3;
        }

        public final void run() {
            if (!this.f7493a.f7485d) {
                com.bytedance.android.livesdk.utils.p.a(this.f7494b);
                this.f7493a.a(this.f7494b, this.f7495c, this.f7496d + 1, this.f7497e);
            }
        }
    }

    public final void a() {
        if (this.f7485d) {
            LiveEditText liveEditText = (LiveEditText) a(R.id.u1);
            l.b(liveEditText, "");
            com.bytedance.android.livesdk.utils.p.b((EditText) liveEditText);
        }
    }

    private final void b() {
        int i2;
        int size = ((BlockWordFlowLayout) a(R.id.b75)).getSize();
        LiveTextView liveTextView = (LiveTextView) a(R.id.u4);
        l.b(liveTextView, "");
        boolean z = false;
        liveTextView.setText(y.a((int) R.string.e95, Integer.valueOf(size), Long.valueOf(this.f7486f)));
        if (((long) size) >= this.f7486f) {
            z = true;
        }
        ImageView imageView = (ImageView) a(R.id.ty);
        if (z) {
            i2 = R.drawable.c4w;
        } else {
            i2 = R.drawable.c4v;
        }
        imageView.setImageResource(i2);
        ((ImageView) a(R.id.ty)).setOnClickListener(new f(this, z));
    }

    public static final class d implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BlockWordView f7492a;

        static {
            Covode.recordClassIndex(3683);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            l.d(charSequence, "");
        }

        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            l.d(charSequence, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(BlockWordView blockWordView) {
            this.f7492a = blockWordView;
        }

        public final void afterTextChanged(Editable editable) {
            String obj;
            int i2;
            l.d(editable, "");
            LiveEditText liveEditText = (LiveEditText) this.f7492a.a(R.id.u1);
            l.b(liveEditText, "");
            Editable text = liveEditText.getText();
            if (text != null && (obj = text.toString()) != null) {
                FitTextView fitTextView = (FitTextView) this.f7492a.a(R.id.u2);
                l.b(fitTextView, "");
                if (obj.length() == 0) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                fitTextView.setVisibility(i2);
                if (obj.length() > this.f7492a.f7484c) {
                    ao.a(y.e(), (int) R.string.e_i);
                    BlockWordView blockWordView = this.f7492a;
                    LiveEditText liveEditText2 = (LiveEditText) blockWordView.a(R.id.u1);
                    l.b(liveEditText2, "");
                    blockWordView.f7483b = new InputFilter.LengthFilter(obj.length());
                    liveEditText2.setFilters(new InputFilter.LengthFilter[]{blockWordView.f7483b});
                    int i3 = this.f7492a.f7484c;
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
                    String substring = obj.substring(0, i3);
                    l.b(substring, "");
                    ((LiveEditText) this.f7492a.a(R.id.u1)).setText(substring);
                    ((LiveEditText) this.f7492a.a(R.id.u1)).setSelection(substring.length());
                    return;
                }
                BlockWordView blockWordView2 = this.f7492a;
                LiveEditText liveEditText3 = (LiveEditText) blockWordView2.a(R.id.u1);
                l.b(liveEditText3, "");
                if (blockWordView2.f7483b != null) {
                    liveEditText3.setFilters(new InputFilter[0]);
                    blockWordView2.f7483b = null;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BlockWordView f7498a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f7499b;

        static {
            Covode.recordClassIndex(3685);
        }

        f(BlockWordView blockWordView, boolean z) {
            this.f7498a = blockWordView;
            this.f7499b = z;
        }

        public final void onClick(View view) {
            if (this.f7499b) {
                ao.a(y.e(), (int) R.string.e_j);
                return;
            }
            ((LiveEditText) this.f7498a.a(R.id.u1)).postDelayed(new Runnable(this) {
                /* class com.bytedance.android.live.broadcast.api.blockword.BlockWordView.f.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ f f7500a;

                static {
                    Covode.recordClassIndex(3686);
                }

                {
                    this.f7500a = r1;
                }

                public final void run() {
                    this.f7500a.f7498a.a((EditText) this.f7500a.f7498a.a(R.id.u1), 200, 1, 5);
                    ((LiveEditText) this.f7500a.f7498a.a(R.id.u1)).requestFocus();
                    LiveEditText liveEditText = (LiveEditText) this.f7500a.f7498a.a(R.id.u1);
                    l.b(liveEditText, "");
                    com.bytedance.android.livesdk.utils.p.a((EditText) liveEditText);
                }
            }, 100);
            b.a.a("livesdk_stopword_set").a().b();
        }
    }

    static final class b extends m implements h.f.a.b<com.bytedance.android.live.broadcast.api.blockword.model.a, z> {
        final /* synthetic */ BlockWordView this$0;

        static {
            Covode.recordClassIndex(3681);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(BlockWordView blockWordView) {
            super(1);
            this.this$0 = blockWordView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.android.live.broadcast.api.blockword.model.a aVar) {
            String str;
            com.bytedance.android.live.broadcast.api.blockword.model.a aVar2 = aVar;
            l.d(aVar2, "");
            a aVar3 = this.this$0.f7482a;
            l.d(aVar2, "");
            com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_tns_delete_keywords");
            String str2 = aVar3.f7502b;
            if (str2 == null) {
                l.a("eventPage");
            }
            com.bytedance.android.livesdk.ab.b a3 = a2.d(str2).a("keyword", aVar2.f7520b).a("timestamp", System.currentTimeMillis());
            if (aVar3.f7503c) {
                str = "host";
            } else {
                str = "moderator";
            }
            a3.a("modified_by", str).b();
            aVar3.f7501a.deleteBlockWord(aVar2.f7519a, aVar3.f7504d.toString(), aVar3.f7505e).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(new a.d(aVar3, aVar2), new a.e(aVar3, aVar2));
            return z.f158842a;
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.blockword.a.AbstractC0101a
    public final void a(com.bytedance.android.live.broadcast.api.blockword.model.a aVar) {
        l.d(aVar, "");
        ((BlockWordFlowLayout) a(R.id.b75)).a(aVar, 0);
        b();
        b.a.a("livesdk_stopword_set_success").a().a("context", aVar.f7520b).b();
    }

    @Override // com.bytedance.android.live.broadcast.api.blockword.a.AbstractC0101a
    public final void b(com.bytedance.android.live.broadcast.api.blockword.model.a aVar) {
        l.d(aVar, "");
        BlockWordFlowLayout blockWordFlowLayout = (BlockWordFlowLayout) a(R.id.b75);
        l.d(aVar, "");
        blockWordFlowLayout.f7468c = true;
        int childCount = blockWordFlowLayout.getChildCount() - 2;
        if (childCount >= 0) {
            int i2 = 0;
            while (true) {
                View childAt = blockWordFlowLayout.getChildAt(i2);
                l.b(childAt, "");
                LiveTextView liveTextView = (LiveTextView) childAt.findViewById(R.id.tz);
                l.b(liveTextView, "");
                if (!l.a((Object) liveTextView.getText(), (Object) aVar.f7520b)) {
                    if (i2 == childCount) {
                        break;
                    }
                    i2++;
                } else {
                    blockWordFlowLayout.removeViewAt(i2);
                    break;
                }
            }
        }
        b();
        b.a.a("livesdk_stopword_cancel").a().a("context", aVar.f7520b).b();
    }

    @Override // com.bytedance.android.live.broadcast.api.blockword.a.AbstractC0101a
    public final void a(Throwable th) {
        String str;
        l.d(th, "");
        if (th instanceof com.bytedance.android.live.a.a.b.a) {
            com.bytedance.android.live.a.a.b.a aVar = (com.bytedance.android.live.a.a.b.a) th;
            switch (aVar.getErrorCode()) {
                case 80070:
                    str = "limited";
                    break;
                case 80071:
                    str = "illegal";
                    break;
                case 80072:
                    str = "lengthy";
                    break;
                case 80073:
                    str = "existed";
                    break;
                default:
                    ao.a(y.e(), (int) R.string.gwf);
                    return;
            }
            String prompt = aVar.getPrompt();
            l.b(prompt, "");
            com.bytedance.android.livesdk.utils.p.a(prompt);
            b.a.a("livesdk_stopword_set_toast").a().a("toast_type", str).b();
        }
    }

    public final void a(boolean z) {
        int i2;
        if (this.f7485d != z) {
            this.f7485d = z;
            RelativeLayout relativeLayout = (RelativeLayout) a(R.id.u3);
            l.b(relativeLayout, "");
            int i3 = 0;
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            relativeLayout.setVisibility(i2);
            RelativeLayout relativeLayout2 = (RelativeLayout) a(R.id.u3);
            l.b(relativeLayout2, "");
            RelativeLayout relativeLayout3 = (RelativeLayout) a(R.id.u3);
            l.b(relativeLayout3, "");
            ViewGroup.LayoutParams layoutParams = relativeLayout3.getLayoutParams();
            if (z) {
                i3 = y.a(52.0f);
            }
            layoutParams.height = i3;
            relativeLayout2.setLayoutParams(layoutParams);
        }
    }

    private /* synthetic */ BlockWordView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private BlockWordView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(448);
        this.f7482a = new a(this);
        this.f7484c = 30;
        d dVar = new d(this);
        this.f7487g = dVar;
        c cVar = new c(this, context);
        this.f7488h = cVar;
        FrameLayout.inflate(getContext(), R.layout.b5h, this);
        ((LiveEditText) a(R.id.u1)).addTextChangedListener(dVar);
        ((LiveEditText) a(R.id.u1)).setOnEditorActionListener(cVar);
        ((BlockWordFlowLayout) a(R.id.b75)).setDeleteListener(new b(this));
        MethodCollector.o(448);
    }

    @Override // com.bytedance.android.live.broadcast.api.blockword.a.AbstractC0101a
    public final void a(List<com.bytedance.android.live.broadcast.api.blockword.model.a> list, long j2, long j3) {
        l.d(list, "");
        this.f7486f = j2;
        this.f7484c = (int) j3;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            BlockWordFlowLayout blockWordFlowLayout = (BlockWordFlowLayout) a(R.id.b75);
            blockWordFlowLayout.a(it.next(), blockWordFlowLayout.getChildCount() - 1);
        }
        b();
        FitTextView fitTextView = (FitTextView) a(R.id.u2);
        l.b(fitTextView, "");
        fitTextView.setText(getContext().getString(R.string.e_l, Integer.valueOf(this.f7484c)));
    }

    public final void a(EditText editText, long j2, int i2, int i3) {
        if (i2 <= i3 && editText != null) {
            editText.postDelayed(new e(this, editText, j2, i2, i3), j2);
        }
    }
}
