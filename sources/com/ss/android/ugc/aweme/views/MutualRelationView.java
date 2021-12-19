package com.ss.android.ugc.aweme.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.h.i;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.friends.model.MutualUser;
import com.ss.android.ugc.aweme.views.SuggestUserAvatarView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.z;
import java.util.List;

public final class MutualRelationView extends LinearLayout {

    /* renamed from: c  reason: collision with root package name */
    public static final a f144501c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public TuxTextView f144502a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f144503b;

    /* renamed from: d  reason: collision with root package name */
    private View f144504d;

    /* renamed from: e  reason: collision with root package name */
    private SuggestUserAvatarView f144505e;

    /* renamed from: f  reason: collision with root package name */
    private final TuxTextView f144506f;

    static {
        Covode.recordClassIndex(94586);
    }

    public MutualRelationView(Context context) {
        this(context, (AttributeSet) null, 6);
    }

    public MutualRelationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(94587);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static String a(Context context, Integer num) {
            l.d(context, "");
            if (num != null) {
                if (num.intValue() == 3) {
                    String string = context.getString(R.string.f8i);
                    l.b(string, "");
                    return string;
                } else if (num.intValue() == 2) {
                    String string2 = context.getString(R.string.f8h);
                    l.b(string2, "");
                    return string2;
                } else if (num.intValue() == 1) {
                    String string3 = context.getString(R.string.f8j);
                    l.b(string3, "");
                    return string3;
                }
            }
            return "";
        }
    }

    public final SuggestUserAvatarView getRelativeAvatar() {
        return this.f144505e;
    }

    public final TuxTextView getTvDesc() {
        return this.f144502a;
    }

    public final TuxTextView getTvDescTextOnly() {
        return this.f144506f;
    }

    public final void b() {
        this.f144505e.f144557a = true;
    }

    public final void a() {
        this.f144502a.setVisibility(0);
        this.f144506f.setVisibility(8);
        this.f144505e.setVisibility(8);
    }

    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MutualRelationView f144507a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f144508b = 8.0f;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ MutualStruct f144509c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f144510d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ float f144511e;

        static {
            Covode.recordClassIndex(94588);
        }

        b(MutualRelationView mutualRelationView, MutualStruct mutualStruct, float f2) {
            this.f144507a = mutualRelationView;
            this.f144509c = mutualStruct;
            this.f144510d = 2;
            this.f144511e = f2;
        }

        public final void run() {
            CharSequence text = this.f144507a.getTvDesc().getText();
            if (this.f144507a.getTvDesc().getLayout() != null) {
                Layout layout = this.f144507a.getTvDesc().getLayout();
                l.b(layout, "");
                int lineCount = layout.getLineCount();
                int i2 = lineCount - 1;
                float c2 = ((float) n.c(this.f144507a.getContext(), this.f144507a.getTvDesc().getLayout().getLineWidth(i2))) + (this.f144508b * 2.0f) + SuggestUserAvatarView.a.a(this.f144509c);
                if (lineCount < this.f144510d && c2 > this.f144511e) {
                    this.f144507a.getTvDescTextOnly().setText(this.f144507a.getTvDesc().getText());
                    this.f144507a.getTvDesc().setText("");
                    this.f144507a.getTvDescTextOnly().setVisibility(0);
                } else if (lineCount > 1) {
                    int lineStart = this.f144507a.getTvDesc().getLayout().getLineStart(i2);
                    TuxTextView tvDescTextOnly = this.f144507a.getTvDescTextOnly();
                    l.b(text, "");
                    tvDescTextOnly.setText(text.subSequence(0, lineStart).toString());
                    this.f144507a.getTvDesc().setText(text.subSequence(lineStart, text.length() - 1).toString());
                    this.f144507a.getTvDesc().setMaxLines(1);
                    this.f144507a.getTvDescTextOnly().setVisibility(0);
                } else {
                    this.f144507a.getTvDescTextOnly().setVisibility(8);
                }
                if (lineCount != this.f144510d || c2 <= this.f144511e) {
                    this.f144507a.getRelativeAvatar().setVisibility(0);
                } else {
                    this.f144507a.getRelativeAvatar().setVisibility(8);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MutualRelationView f144512a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ z.e f144513b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.c f144514c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ MutualStruct f144515d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ z.e f144516e;

        static {
            Covode.recordClassIndex(94589);
        }

        c(MutualRelationView mutualRelationView, z.e eVar, z.c cVar, MutualStruct mutualStruct, z.e eVar2) {
            this.f144512a = mutualRelationView;
            this.f144513b = eVar;
            this.f144514c = cVar;
            this.f144515d = mutualStruct;
            this.f144516e = eVar2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0116, code lost:
            if (java.lang.Math.abs(r10) < (r0 - 2)) goto L_0x00b0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 283
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.views.MutualRelationView.c.run():void");
        }
    }

    public final void setDarkMode(boolean z) {
        this.f144505e.setDarkMode(z);
    }

    public final void setRelativeAvatar(SuggestUserAvatarView suggestUserAvatarView) {
        l.d(suggestUserAvatarView, "");
        this.f144505e = suggestUserAvatarView;
    }

    public final void setSocialVideoTag(boolean z) {
        this.f144505e.setSocialVideoTag(z);
    }

    public final void setTextColor(int i2) {
        this.f144502a.setTextColor(i2);
    }

    public final void setTvDesc(TuxTextView tuxTextView) {
        l.d(tuxTextView, "");
        this.f144502a = tuxTextView;
    }

    public final void setTvMaxWidth(int i2) {
        this.f144502a.setMaxWidth(i2);
    }

    private final void setAvatarView(MutualStruct mutualStruct) {
        this.f144505e.setVisibility(0);
        this.f144505e.b(mutualStruct);
    }

    public final void setAllTextColorUseAttrResource(int i2) {
        this.f144502a.setTextColorRes(i2);
        this.f144506f.setTextColorRes(i2);
    }

    public final void setRootBackground(Drawable drawable) {
        l.d(drawable, "");
        this.f144504d.setBackground(drawable);
    }

    public final void setTuxTextSize(int i2) {
        this.f144502a.setTuxFont(i2);
        this.f144506f.setTuxFont(i2);
    }

    private final String a(int i2) {
        String quantityString = getResources().getQuantityString(R.plurals.fb, i2, Integer.valueOf(i2));
        l.b(quantityString, "");
        return quantityString;
    }

    private final void setTextSuggestStr(MutualStruct mutualStruct) {
        this.f144502a.setVisibility(0);
        List<MutualUser> userList = mutualStruct.getUserList();
        if (userList == null || userList.isEmpty()) {
            this.f144502a.setText(a(mutualStruct.getTotal()));
            return;
        }
        TuxTextView tuxTextView = this.f144502a;
        Context context = getContext();
        l.b(context, "");
        tuxTextView.setText(a.a(context, Integer.valueOf(mutualStruct.getMutualType())));
    }

    public final void setNickNameBold(String str) {
        SpannableStringBuilder spannableStringBuilder;
        int length;
        int length2;
        if (this.f144503b && (length = str.length()) < (length2 = (spannableStringBuilder = new SpannableStringBuilder(this.f144502a.getText().toString())).length())) {
            spannableStringBuilder.setSpan(new StyleSpan(1), length, length2, 33);
            this.f144502a.setText(spannableStringBuilder);
        }
    }

    private final void setTextWithoutNum(MutualStruct mutualStruct) {
        String str;
        String nickname;
        List<MutualUser> userList = mutualStruct.getUserList();
        if (userList == null || !userList.isEmpty()) {
            this.f144502a.setVisibility(0);
            List<MutualUser> userList2 = mutualStruct.getUserList();
            if (userList2 == null) {
                userList2 = h.a.z.INSTANCE;
            }
            MutualUser mutualUser = userList2.get(0);
            String str2 = "";
            if (mutualUser == null || (str = mutualUser.getNickname()) == null) {
                str = str2;
            }
            Context context = getContext();
            l.b(context, str2);
            String a2 = a.a(context, Integer.valueOf(mutualStruct.getMutualType()));
            if (userList2.size() > 1) {
                MutualUser mutualUser2 = userList2.get(1);
                if (!(mutualUser2 == null || (nickname = mutualUser2.getNickname()) == null)) {
                    str2 = nickname;
                }
                str2 = a2 + " " + str + "," + str2 + " ";
            } else if (userList2.size() == 1) {
                str2 = a2 + " " + str + " ";
            }
            this.f144502a.setText(str2);
            setNickNameBold(a2);
            return;
        }
        this.f144502a.setText(a(mutualStruct.getTotal()));
    }

    public final void a(int i2, int i3) {
        this.f144505e.b(i2, i3);
    }

    public final void b(int i2, int i3) {
        this.f144505e.a(i2, i3);
    }

    public final void a(MutualStruct mutualStruct, float f2) {
        l.d(mutualStruct, "");
        this.f144505e.setVisibility(8);
        this.f144502a.setMaxLines(2);
        i.b(this.f144506f, 0, 0, 0, 0, false, 16);
        i.b(this.f144502a, 0, 0, 0, 0, false, 16);
        this.f144502a.post(new b(this, mutualStruct, f2));
    }

    public final void a(MutualStruct mutualStruct, int i2) {
        if (mutualStruct != null && mutualStruct.getTotal() > 0) {
            switch (i2) {
                case 1:
                    a(mutualStruct, 1, 1);
                    return;
                case 2:
                    a(mutualStruct, 1, 2);
                    return;
                case 3:
                    a(mutualStruct, 2, 2);
                    return;
                case 4:
                    setTextSuggestStr(mutualStruct);
                    setAvatarView(mutualStruct);
                    return;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    setTextWithoutNum(mutualStruct);
                    setAvatarView(mutualStruct);
                    return;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    setTextSuggestStr(mutualStruct);
                    this.f144505e.b(mutualStruct);
                    this.f144505e.setVisibility(8);
                    return;
                default:
                    this.f144502a.setVisibility(8);
                    this.f144505e.setVisibility(8);
                    return;
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ MutualRelationView(Context context, AttributeSet attributeSet, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private MutualRelationView(Context context, AttributeSet attributeSet, byte b2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(4178);
        View.inflate(context, R.layout.agr, this);
        View findViewById = findViewById(R.id.cru);
        l.b(findViewById, "");
        this.f144504d = findViewById;
        View findViewById2 = findViewById(R.id.eyc);
        l.b(findViewById2, "");
        this.f144502a = (TuxTextView) findViewById2;
        View findViewById3 = findViewById(R.id.dki);
        l.b(findViewById3, "");
        this.f144505e = (SuggestUserAvatarView) findViewById3;
        View findViewById4 = findViewById(R.id.eyd);
        l.b(findViewById4, "");
        this.f144506f = (TuxTextView) findViewById4;
        MethodCollector.o(4178);
    }

    private final void a(MutualStruct mutualStruct, int i2, int i3) {
        int size;
        String nickname;
        String str;
        this.f144502a.setVisibility(0);
        List<MutualUser> userList = mutualStruct.getUserList();
        if (userList == null) {
            userList = h.a.z.INSTANCE;
        }
        int total = mutualStruct.getTotal();
        this.f144502a.setMaxLines(i2);
        z.e eVar = new z.e();
        eVar.element = (T) new StringBuilder();
        z.e eVar2 = new z.e();
        Context context = getContext();
        String str2 = "";
        l.b(context, str2);
        eVar2.element = (T) a.a(context, Integer.valueOf(mutualStruct.getMutualType()));
        eVar.element.append(eVar2.element).append(" ");
        if (i3 <= 1 || total <= 1) {
            T t = eVar.element;
            MutualUser mutualUser = userList.get(0);
            if (!(mutualUser == null || (nickname = mutualUser.getNickname()) == null)) {
                str2 = nickname;
            }
            t.append(str2).append(" ");
        } else {
            int i4 = 0;
            for (T t2 : userList) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    h.a.n.a();
                }
                T t3 = t2;
                T t4 = eVar.element;
                if (t3 == null || (str = t3.getNickname()) == null) {
                    str = str2;
                }
                t4.append(str);
                if (i4 != userList.size() - 1) {
                    eVar.element.append(", ");
                } else {
                    eVar.element.append(" ");
                }
                i4 = i5;
            }
        }
        eVar.element.length();
        z.c cVar = new z.c();
        if (i3 == 1) {
            size = total - 1;
        } else {
            size = total - userList.size();
        }
        cVar.element = size;
        if (cVar.element > 99) {
            cVar.element = 99;
        }
        if (cVar.element > 0) {
            this.f144502a.setText(eVar.element.append(getContext().getString(R.string.f8k, Integer.valueOf(cVar.element))));
        } else {
            this.f144502a.setText(eVar.element);
        }
        this.f144502a.post(new c(this, eVar, cVar, mutualStruct, eVar2));
    }

    /* access modifiers changed from: private */
    public void a(Integer num, Integer num2, Integer num3, Integer num4) {
        i.a(this.f144504d, num, num2, num3, num4, true);
    }
}
