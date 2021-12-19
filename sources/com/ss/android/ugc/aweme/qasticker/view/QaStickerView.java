package com.ss.android.ugc.aweme.qasticker.view;

import android.content.Context;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxEditText;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.setting.x;
import com.ss.android.ugc.aweme.shortvideo.dv;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.ss.android.ugc.aweme.sticker.data.f;
import com.ss.android.ugc.tools.utils.KeyboardUtils;
import com.ss.android.ugc.tools.view.widget.CircleImageView;
import com.zhiliaoapp.musically.R;
import h.a.z;
import h.f.b.l;
import h.m.p;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class QaStickerView extends ConstraintLayout {

    /* renamed from: k  reason: collision with root package name */
    public static final a f119165k = new a((byte) 0);

    /* renamed from: g  reason: collision with root package name */
    public ConstraintLayout f119166g;

    /* renamed from: h  reason: collision with root package name */
    public TuxEditText f119167h;

    /* renamed from: i  reason: collision with root package name */
    public TuxTextView f119168i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f119169j;

    /* renamed from: l  reason: collision with root package name */
    private CircleImageView f119170l;

    /* renamed from: m  reason: collision with root package name */
    private long f119171m;
    private long n;
    private long o;
    private String p;
    private String q;
    private f r;
    private UrlModel s;
    private List<Long> t;
    private boolean u;

    static {
        Covode.recordClassIndex(77392);
    }

    public QaStickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(77393);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(Spannable spannable) {
            l.d(spannable, "");
            List<String> c2 = x.c();
            Integer b2 = x.b();
            if (!(c2.isEmpty() || b2 == null)) {
                for (ForegroundColorSpan foregroundColorSpan : (ForegroundColorSpan[]) spannable.getSpans(0, spannable.length(), ForegroundColorSpan.class)) {
                    spannable.removeSpan(foregroundColorSpan);
                }
                for (String str : c2) {
                    Matcher matcher = Pattern.compile(str, 2).matcher(spannable);
                    while (matcher.find()) {
                        spannable.setSpan(new ForegroundColorSpan(b2.intValue()), matcher.start(), matcher.end(), 33);
                    }
                }
            }
        }
    }

    public final boolean getTouchAble() {
        return this.u;
    }

    public final ConstraintLayout getContentView() {
        ConstraintLayout constraintLayout = this.f119166g;
        if (constraintLayout == null) {
            l.a("contentView");
        }
        return constraintLayout;
    }

    public final void b() {
        TuxEditText tuxEditText = this.f119167h;
        if (tuxEditText == null) {
            l.a("questionEditText");
        }
        tuxEditText.setFocusable(false);
        TuxEditText tuxEditText2 = this.f119167h;
        if (tuxEditText2 == null) {
            l.a("questionEditText");
        }
        tuxEditText2.setFocusableInTouchMode(false);
    }

    public final String getQaEditTextContent() {
        String obj;
        TuxEditText tuxEditText = this.f119167h;
        if (tuxEditText == null) {
            l.a("questionEditText");
        }
        Editable text = tuxEditText.getText();
        if (text == null || (obj = text.toString()) == null) {
            return "";
        }
        return obj;
    }

    public final void d() {
        TuxTextView tuxTextView = this.f119168i;
        if (tuxTextView == null) {
            l.a("questionText");
        }
        tuxTextView.setVisibility(8);
        TuxEditText tuxEditText = this.f119167h;
        if (tuxEditText == null) {
            l.a("questionEditText");
        }
        tuxEditText.setVisibility(0);
        TuxEditText tuxEditText2 = this.f119167h;
        if (tuxEditText2 == null) {
            l.a("questionEditText");
        }
        TuxTextView tuxTextView2 = this.f119168i;
        if (tuxTextView2 == null) {
            l.a("questionText");
        }
        tuxEditText2.setText(tuxTextView2.getText().toString());
    }

    public final void c() {
        int i2;
        TuxEditText tuxEditText = this.f119167h;
        if (tuxEditText == null) {
            l.a("questionEditText");
        }
        tuxEditText.setFocusable(true);
        TuxEditText tuxEditText2 = this.f119167h;
        if (tuxEditText2 == null) {
            l.a("questionEditText");
        }
        tuxEditText2.setFocusableInTouchMode(true);
        TuxEditText tuxEditText3 = this.f119167h;
        if (tuxEditText3 == null) {
            l.a("questionEditText");
        }
        tuxEditText3.requestFocus();
        TuxEditText tuxEditText4 = this.f119167h;
        if (tuxEditText4 == null) {
            l.a("questionEditText");
        }
        KeyboardUtils.b(tuxEditText4, i.f115645a);
        TuxEditText tuxEditText5 = this.f119167h;
        if (tuxEditText5 == null) {
            l.a("questionEditText");
        }
        TuxEditText tuxEditText6 = this.f119167h;
        if (tuxEditText6 == null) {
            l.a("questionEditText");
        }
        Editable text = tuxEditText6.getText();
        if (text != null) {
            i2 = text.length();
        } else {
            i2 = 0;
        }
        tuxEditText5.setSelection(i2);
        this.f119169j = true;
    }

    public final QaStruct getQaStruct() {
        String obj;
        TuxEditText tuxEditText = this.f119167h;
        if (tuxEditText == null) {
            l.a("questionEditText");
        }
        Editable text = tuxEditText.getText();
        String str = null;
        if (text == null || (obj = text.toString()) == null || obj.length() == 0) {
            TuxTextView tuxTextView = this.f119168i;
            if (tuxTextView == null) {
                l.a("questionText");
            }
            CharSequence text2 = tuxTextView.getText();
            if (text2 == null || (str = text2.toString()) == null) {
                str = "";
            }
        } else {
            TuxEditText tuxEditText2 = this.f119167h;
            if (tuxEditText2 == null) {
                l.a("questionEditText");
            }
            Editable text3 = tuxEditText2.getText();
            if (text3 != null) {
                str = text3.toString();
            }
        }
        return new QaStruct(this.n, this.o, this.f119171m, this.s, this.q, str, this.p, this.t, this.r);
    }

    public final void setTouchAble(boolean z) {
        this.u = z;
    }

    public static final class b implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ QaStickerView f119172a;

        static {
            Covode.recordClassIndex(77394);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(QaStickerView qaStickerView) {
            this.f119172a = qaStickerView;
        }

        public final void afterTextChanged(Editable editable) {
            Editable text;
            TuxEditText a2 = QaStickerView.a(this.f119172a);
            if (!(a2 == null || (text = a2.getText()) == null || text.length() == 0 || com.ss.android.ugc.aweme.qasticker.b.a(a2) <= 6)) {
                String obj = a2.getText().toString();
                if (obj.length() >= 600) {
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
                    obj = obj.substring(0, 600);
                    l.b(obj, "");
                }
                Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
                String substring = obj.substring(0, obj.length() - 1);
                l.b(substring, "");
                int length = substring.length() - 1;
                while (length >= 0 && Character.isHighSurrogate(substring.charAt(length))) {
                    Objects.requireNonNull(substring, "null cannot be cast to non-null type java.lang.String");
                    substring = substring.substring(0, length);
                    l.b(substring, "");
                    length--;
                }
                a2.setText(substring);
                a2.setSelection(a2.getText().length());
            }
            if (editable != null) {
                a.a(editable);
            }
        }

        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            if (charSequence != null) {
                boolean z = false;
                if (this.f119172a.f119169j) {
                    this.f119172a.f119169j = false;
                    r.a("input_question", new com.ss.android.ugc.tools.f.b().a("enter_from", "video_edit_page").a("group_id", dv.a()).a("author_id", g.a().A().c()).a("question_user_id", g.a().A().c()).f149193a);
                }
                if (p.b(charSequence).length() == 0) {
                    z = true;
                }
                if (z) {
                    TuxEditText a2 = QaStickerView.a(this.f119172a);
                    Context context = this.f119172a.getContext();
                    l.b(context, "");
                    a2.setHint(context.getResources().getString(R.string.cq));
                    return;
                }
                QaStickerView.a(this.f119172a).setHint("");
            }
        }
    }

    public final void setContentView(ConstraintLayout constraintLayout) {
        l.d(constraintLayout, "");
        this.f119166g = constraintLayout;
    }

    public static final /* synthetic */ TuxEditText a(QaStickerView qaStickerView) {
        TuxEditText tuxEditText = qaStickerView.f119167h;
        if (tuxEditText == null) {
            l.a("questionEditText");
        }
        return tuxEditText;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.u) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setAlpha(boolean z) {
        float f2;
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.3137255f;
        }
        setAlpha(f2);
    }

    public final void a(QaStruct qaStruct) {
        if (qaStruct != null) {
            UrlModel avatarUrl = qaStruct.getAvatarUrl();
            if (avatarUrl != null) {
                this.s = avatarUrl;
                CircleImageView circleImageView = this.f119170l;
                if (circleImageView == null) {
                    l.a("avatarImage");
                }
                com.ss.android.ugc.tools.c.a.a(circleImageView, avatarUrl, -1, -1);
            }
            String questionContent = qaStruct.getQuestionContent();
            if (questionContent != null) {
                TuxEditText tuxEditText = this.f119167h;
                if (tuxEditText == null) {
                    l.a("questionEditText");
                }
                tuxEditText.setVisibility(8);
                TuxTextView tuxTextView = this.f119168i;
                if (tuxTextView == null) {
                    l.a("questionText");
                }
                tuxTextView.setVisibility(0);
                SpannableString spannableString = new SpannableString(questionContent);
                a.a(spannableString);
                TuxTextView tuxTextView2 = this.f119168i;
                if (tuxTextView2 == null) {
                    l.a("questionText");
                }
                tuxTextView2.setText(spannableString);
                TuxEditText tuxEditText2 = this.f119167h;
                if (tuxEditText2 == null) {
                    l.a("questionEditText");
                }
                tuxEditText2.setText(spannableString);
            }
            this.n = qaStruct.getQuestionId();
            this.o = qaStruct.getUserId();
            this.p = qaStruct.getSecId();
            this.f119171m = qaStruct.getItemId();
            String userName = qaStruct.getUserName();
            if (userName == null) {
                userName = "";
            }
            this.q = userName;
            this.t = qaStruct.getInviteUserList();
            this.r = qaStruct.getSource();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ QaStickerView(Context context, AttributeSet attributeSet, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private QaStickerView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        UrlModel urlModel;
        l.d(context, "");
        this.p = "";
        this.q = "";
        this.r = f.StickerPanel;
        com.ss.android.ugc.aweme.account.model.a e2 = g.a().A().e();
        if (e2 != null) {
            urlModel = e2.f();
        } else {
            urlModel = null;
        }
        this.s = urlModel;
        this.t = z.INSTANCE;
        View a2 = com.a.a(LayoutInflater.from(getContext()), R.layout.ct, this, true);
        Objects.requireNonNull(a2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        ConstraintLayout constraintLayout = (ConstraintLayout) a2;
        this.f119166g = constraintLayout;
        if (constraintLayout == null) {
            l.a("contentView");
        }
        View findViewById = constraintLayout.findViewById(R.id.dec);
        l.b(findViewById, "");
        this.f119170l = (CircleImageView) findViewById;
        ConstraintLayout constraintLayout2 = this.f119166g;
        if (constraintLayout2 == null) {
            l.a("contentView");
        }
        View findViewById2 = constraintLayout2.findViewById(R.id.ded);
        l.b(findViewById2, "");
        TuxEditText tuxEditText = (TuxEditText) findViewById2;
        this.f119167h = tuxEditText;
        if (tuxEditText == null) {
            l.a("questionEditText");
        }
        Context context2 = getContext();
        l.b(context2, "");
        tuxEditText.setMaxWidth((int) com.ss.android.ugc.tools.utils.r.a(context2, 186.0f));
        ConstraintLayout constraintLayout3 = this.f119166g;
        if (constraintLayout3 == null) {
            l.a("contentView");
        }
        View findViewById3 = constraintLayout3.findViewById(R.id.def);
        l.b(findViewById3, "");
        this.f119168i = (TuxTextView) findViewById3;
        CircleImageView circleImageView = this.f119170l;
        if (circleImageView == null) {
            l.a("avatarImage");
        }
        com.ss.android.ugc.tools.c.a.a(circleImageView, this.s, -1, -1);
        TuxEditText tuxEditText2 = this.f119167h;
        if (tuxEditText2 == null) {
            l.a("questionEditText");
        }
        tuxEditText2.addTextChangedListener(new b(this));
    }
}
