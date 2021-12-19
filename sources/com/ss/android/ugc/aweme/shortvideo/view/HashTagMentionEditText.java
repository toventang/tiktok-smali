package com.ss.android.ugc.aweme.shortvideo.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.port.in.ax;
import com.ss.android.ugc.aweme.port.in.l;
import com.ss.android.ugc.aweme.shortvideo.aa.c;
import com.ss.android.ugc.aweme.shortvideo.ae.f;
import com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import com.ss.android.ugc.aweme.shortvideo.model.Mission;
import com.ss.android.ugc.aweme.shortvideo.model.MissionUser;
import com.ss.android.ugc.aweme.shortvideo.util.as;
import com.ss.android.ugc.aweme.shortvideo.view.MentionEditText;
import com.ss.android.ugc.aweme.utils.dj;
import com.ss.android.ugc.aweme.video.hashtag.a;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

public class HashTagMentionEditText extends MentionEditText implements com.ss.android.ugc.aweme.shortvideo.aa.b {
    private static final String E = HashTagMentionEditText.class.getSimpleName();
    private final int F = 70;
    private String G = "";
    private boolean H;
    private int I;
    private int J;
    private List<InputFilter> K;
    private b L;
    private HashSet<String> M = new HashSet<>();
    private Boolean N = false;
    private a O = null;
    private String P = null;
    private com.ss.android.ugc.aweme.ba.b Q = null;
    private int R;
    private boolean S = false;

    /* renamed from: a  reason: collision with root package name */
    int f132569a;

    /* renamed from: b  reason: collision with root package name */
    com.ss.android.ugc.aweme.shortvideo.aa.a f132570b;

    /* renamed from: c  reason: collision with root package name */
    c f132571c;

    /* renamed from: d  reason: collision with root package name */
    int f132572d;

    /* renamed from: e  reason: collision with root package name */
    public String f132573e = "";

    /* renamed from: f  reason: collision with root package name */
    public String f132574f = getHint().toString();

    /* renamed from: g  reason: collision with root package name */
    public String f132575g = "";

    /* renamed from: h  reason: collision with root package name */
    com.ss.android.ugc.aweme.ba.a f132576h = null;

    /* renamed from: i  reason: collision with root package name */
    ax.a f132577i;

    /* renamed from: j  reason: collision with root package name */
    View.OnFocusChangeListener f132578j = new View.OnFocusChangeListener() {
        /* class com.ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText.AnonymousClass1 */

        static {
            Covode.recordClassIndex(86759);
        }

        public final void onFocusChange(View view, boolean z) {
            if (z) {
                if (!TextUtils.isEmpty(HashTagMentionEditText.this.f132573e)) {
                    HashTagMentionEditText hashTagMentionEditText = HashTagMentionEditText.this;
                    hashTagMentionEditText.addHashTag(hashTagMentionEditText.f132573e);
                    HashTagMentionEditText hashTagMentionEditText2 = HashTagMentionEditText.this;
                    hashTagMentionEditText2.setHint(hashTagMentionEditText2.f132574f);
                    HashTagMentionEditText.this.f132573e = "";
                }
            } else if (TextUtils.isEmpty(HashTagMentionEditText.this.getNoAdTagText())) {
                HashTagMentionEditText hashTagMentionEditText3 = HashTagMentionEditText.this;
                hashTagMentionEditText3.f132573e = hashTagMentionEditText3.getAdTag();
                HashTagMentionEditText.this.removeHashTag();
                HashTagMentionEditText hashTagMentionEditText4 = HashTagMentionEditText.this;
                hashTagMentionEditText4.f132574f = hashTagMentionEditText4.getHint().toString();
                HashTagMentionEditText.this.setHint(((Object) HashTagMentionEditText.this.getHint()) + HashTagMentionEditText.this.f132573e);
            }
        }
    };

    /* renamed from: k  reason: collision with root package name */
    InputFilter f132579k = new InputFilter() {
        /* class com.ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText.AnonymousClass2 */

        static {
            Covode.recordClassIndex(86760);
        }

        public final CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
            int length = spanned.length() - HashTagMentionEditText.this.f132575g.length();
            if (length < 0) {
                length = 0;
            }
            if (TextUtils.isEmpty(charSequence) && i5 > length) {
                return spanned.subSequence(i4, i5);
            }
            if (i5 > length) {
                return "";
            }
            return null;
        }
    };

    /* renamed from: l  reason: collision with root package name */
    public boolean f132580l = false;

    /* renamed from: m  reason: collision with root package name */
    public int f132581m = 0;

    /* access modifiers changed from: package-private */
    public interface b {
        static {
            Covode.recordClassIndex(86763);
        }

        void a(int i2, int i3);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.view.MentionEditText
    public String getAdTag() {
        return this.f132575g;
    }

    public String getCreationId() {
        return this.G;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.aa.b
    public int getHookAtMaxWidth() {
        return this.I;
    }

    public ax.a getPublishExtensionDataContainer() {
        return this.f132577i;
    }

    public int getVideoType() {
        return this.J;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.view.MentionEditText
    public final void a(String str) {
        String str2 = "";
        if (this.f132576h != null && !TextUtils.isEmpty(this.P)) {
            str2 = str2 + this.P;
        }
        if (!TextUtils.isEmpty(str)) {
            str2 = str2 + str;
        }
        if (!TextUtils.isEmpty(str2)) {
            setFixLengthInFront(str2);
        }
    }

    public final void a(boolean z) {
        if (getText() != null) {
            System.currentTimeMillis();
            c();
            ArrayList<r> arrayList = new ArrayList();
            String noAdTagText = getNoAdTagText();
            for (com.ss.android.ugc.aweme.video.hashtag.a aVar : b(noAdTagText)) {
                arrayList.add(new r(aVar.f143394a, aVar.f143395b));
            }
            ArrayList<r> arrayList2 = new ArrayList(arrayList);
            if (this.r != null && !this.r.isEmpty()) {
                arrayList2.addAll(this.r);
            }
            Collections.sort(arrayList2, g.f132655a);
            int i2 = 0;
            StyleSpan[] styleSpanArr = (StyleSpan[]) getText().getSpans(0, getText().length(), StyleSpan.class);
            for (StyleSpan styleSpan : styleSpanArr) {
                if (styleSpan.getStyle() == 1) {
                    getText().removeSpan(styleSpan);
                }
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (r rVar : arrayList) {
                if (z || rVar.a(getSelectionStart() - 1, getSelectionEnd() - 1) || rVar.a(getSelectionStart() + 1, getSelectionEnd() + 1)) {
                    spannableStringBuilder.append((CharSequence) noAdTagText.substring(rVar.f132667a, rVar.f132668b));
                    boolean b2 = b(arrayList.indexOf(rVar));
                    MentionEditText.MentionSpan mentionSpan = new MentionEditText.MentionSpan(b2 ? this.o : this.n, spannableStringBuilder.toString(), "", 1, "", "");
                    mentionSpan.a(b2);
                    b(rVar.f132667a, rVar.f132668b);
                    getText().setSpan(mentionSpan, rVar.f132667a, rVar.f132668b, 33);
                    getText().setSpan(new StyleSpan(1), rVar.f132667a, rVar.f132668b, 33);
                    spannableStringBuilder.clear();
                }
            }
            int length = noAdTagText.length();
            for (r rVar2 : arrayList2) {
                if (i2 >= 0 && rVar2.f132667a <= length && i2 <= rVar2.f132667a) {
                    b(i2, rVar2.f132667a);
                    getText().setSpan(new StyleSpan(1), rVar2.f132667a, rVar2.f132668b, 33);
                    i2 = rVar2.f132668b;
                }
            }
            if (i2 <= length) {
                b(i2, length);
            }
            Editable text = getText();
            if (text.length() != 0) {
                b(text);
                c(text);
            }
            d();
            com.ss.android.ugc.aweme.framework.a.a.b("MentionEditText", "full: " + z + "\n  text: " + getText().toString() + " and se: " + getSelectionEnd());
        }
    }

    static {
        Covode.recordClassIndex(86758);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.view.MentionEditText
    public final void a() {
        com.ss.android.ugc.aweme.ba.a aVar = this.f132576h;
        if (aVar != null) {
            b(aVar);
        }
        if (this.L != null) {
            this.L = null;
        }
    }

    public int getCurAdTagStart() {
        return Math.max(getText().length() - this.f132575g.length(), 0);
    }

    public String getNoAdTagTextForTitleModule() {
        if (TextUtils.isEmpty(this.f132575g)) {
            return a(getText());
        }
        removeHashTag();
        return a(getText());
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.view.MentionEditText
    public String getNoAdTagText() {
        if (TextUtils.isEmpty(this.f132575g)) {
            return getText().toString();
        }
        return getText().toString().substring(0, getCurAdTagStart());
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.view.MentionEditText, com.ss.android.ugc.aweme.services.publish.IAVMentionEditText
    public void removeHashTag() {
        if (!TextUtils.isEmpty(this.f132575g)) {
            b(this.f132579k);
            this.N = false;
            int curAdTagStart = getCurAdTagStart();
            this.f132575g = "";
            getText().replace(curAdTagStart, getText().length(), "");
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.shortvideo.view.MentionEditText
    public List<TextExtraStruct> getCompatTextExtraStructList() {
        Editable text = getText();
        if (text == null || TextUtils.isEmpty(text.toString())) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        MentionEditText.MentionSpan[] mentionText = getMentionText();
        for (MentionEditText.MentionSpan mentionSpan : mentionText) {
            if (mentionSpan.f132605c == 0 || mentionSpan.f132605c == 5) {
                mentionSpan.f132606d.setStart(text.getSpanStart(mentionSpan));
                mentionSpan.f132606d.setEnd(text.getSpanEnd(mentionSpan));
                arrayList.add(mentionSpan.f132606d);
            }
        }
        List<com.ss.android.ugc.aweme.video.hashtag.a> b2 = b(getNoAdTagText());
        for (com.ss.android.ugc.aweme.video.hashtag.a aVar : b2) {
            TextExtraStruct textExtraStruct = new TextExtraStruct();
            textExtraStruct.setType(1);
            textExtraStruct.setStarAtlasTag(b(b2.indexOf(aVar)));
            textExtraStruct.setHashTagName(aVar.f143396c.replaceAll("#", ""));
            textExtraStruct.setStart(aVar.f143394a);
            textExtraStruct.setEnd(aVar.f143395b);
            arrayList.add(textExtraStruct);
            if (TextUtils.equals(com.ss.android.ugc.aweme.port.in.c.u.c(), null)) {
                com.ss.android.ugc.aweme.port.in.c.f115631j.saveLocalHashTag(true, textExtraStruct.getHashTagName());
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        if (!this.H) {
            if (getVideoType() == 1) {
                r.a("caption_delete", new com.ss.android.ugc.tools.f.b().a("creation_id", this.G).a("caption_type", "duet").f149193a);
            } else if (getVideoType() == 2) {
                r.a("caption_delete", new com.ss.android.ugc.tools.f.b().a("creation_id", this.G).a("caption_type", "react").f149193a);
            } else if (getVideoType() == 3) {
                r.a("caption_delete", new com.ss.android.ugc.tools.f.b().a("creation_id", this.G).a("caption_type", "comment_reply").f149193a);
            }
            this.H = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.view.MentionEditText
    public final void a(int i2) {
        setEmoticonFilter(i2);
    }

    public void setChainString(String str) {
        this.P = str;
    }

    public void setCreationId(String str) {
        this.G = str;
    }

    public void setPublishExtensionDataContainer(ax.a aVar) {
        this.f132577i = aVar;
    }

    public void setVideoType(int i2) {
        this.J = i2;
    }

    class a implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        boolean f132587a;

        /* renamed from: b  reason: collision with root package name */
        int f132588b;

        /* renamed from: c  reason: collision with root package name */
        int f132589c;

        /* renamed from: d  reason: collision with root package name */
        int f132590d;

        static {
            Covode.recordClassIndex(86762);
        }

        private a() {
        }

        public final void afterTextChanged(Editable editable) {
            if (!HashTagMentionEditText.this.f132580l) {
                HashTagMentionEditText.this.a(editable, this.f132588b + this.f132589c);
            }
            HashTagMentionEditText.this.post(new n(this));
        }

        /* synthetic */ a(HashTagMentionEditText hashTagMentionEditText, byte b2) {
            this();
        }

        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            int length;
            Editable text = HashTagMentionEditText.this.getText();
            this.f132589c = i4;
            this.f132588b = i2;
            this.f132590d = i3;
            if (text != null && !TextUtils.isEmpty(text.toString())) {
                List<TextExtraStruct> compatTextExtraStructList = HashTagMentionEditText.this.getCompatTextExtraStructList();
                int length2 = text.length();
                for (TextExtraStruct textExtraStruct : compatTextExtraStructList) {
                    if (textExtraStruct != null && textExtraStruct.getType() == 1 && textExtraStruct.getStart() <= length2 && textExtraStruct.getEnd() <= length2 && textExtraStruct.getStart() <= textExtraStruct.getEnd()) {
                        HashTagMentionEditText.this.a(textExtraStruct, text);
                    }
                }
            }
            HashTagMentionEditText hashTagMentionEditText = HashTagMentionEditText.this;
            int i5 = 0;
            if (!(hashTagMentionEditText.f132569a == 0 || hashTagMentionEditText.f132570b == null)) {
                Editable text2 = hashTagMentionEditText.getText();
                com.ss.android.ugc.aweme.shortvideo.aa.a[] aVarArr = (com.ss.android.ugc.aweme.shortvideo.aa.a[]) text2.getSpans(0, text2.length(), com.ss.android.ugc.aweme.shortvideo.aa.a.class);
                if (aVarArr == null) {
                    length = 0;
                } else {
                    length = aVarArr.length;
                }
                if (hashTagMentionEditText.f132569a == 1 && length == 0) {
                    hashTagMentionEditText.b();
                }
                hashTagMentionEditText.f132569a = length;
            }
            HashTagMentionEditText hashTagMentionEditText2 = HashTagMentionEditText.this;
            if (!(hashTagMentionEditText2.f132572d == 0 || hashTagMentionEditText2.f132571c == null)) {
                Editable text3 = hashTagMentionEditText2.getText();
                c[] cVarArr = (c[]) text3.getSpans(0, text3.length(), c.class);
                if (cVarArr != null) {
                    i5 = cVarArr.length;
                }
                if (hashTagMentionEditText2.f132572d == 1 && i5 == 0) {
                    hashTagMentionEditText2.b();
                }
                hashTagMentionEditText2.f132572d = i5;
            }
        }

        public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            Object valueOf;
            Object valueOf2;
            if (i4 > 0) {
                this.f132587a = false;
                return;
            }
            int i5 = 1;
            this.f132587a = true;
            HashTagMentionEditText hashTagMentionEditText = HashTagMentionEditText.this;
            int i6 = i2 + i3;
            if (hashTagMentionEditText.f132577i != null) {
                String noAdTagText = hashTagMentionEditText.getNoAdTagText();
                if (i2 < i6 && i2 >= 0 && !TextUtils.isEmpty(noAdTagText) && noAdTagText.length() > 0) {
                    com.ss.android.ugc.aweme.account.model.a e2 = com.ss.android.ugc.aweme.port.in.c.u.e();
                    String substring = noAdTagText.substring(i2, i6);
                    Mission a2 = com.ss.android.ugc.aweme.port.in.c.f115633l.a(hashTagMentionEditText.f132577i.a());
                    String str = "0";
                    if (!a2.isChallengeToasted() && a2.getChallengeNames() != null && !a2.getChallengeNames().isEmpty()) {
                        boolean z = false;
                        for (String str2 : a2.getChallengeNames()) {
                            if (substring.length() > i5 && TextUtils.equals(String.valueOf(substring.charAt(substring.length() - i5)), hashTagMentionEditText.getContext().getString(R.string.g2t))) {
                                z = TextUtils.equals(hashTagMentionEditText.c(noAdTagText.substring(0, i6 - 1)), "#".concat(String.valueOf(str2)));
                            }
                            if (TextUtils.equals(substring, "#".concat(String.valueOf(str2))) || z) {
                                a2.setChallengeToasted(true);
                                com.ss.android.ugc.tools.f.b a3 = new com.ss.android.ugc.tools.f.b().a("value", 3).a("mission_id", a2.getMissionId()).a("page_source", a2.getEnterFrom());
                                if (e2 == null) {
                                    valueOf2 = str;
                                } else {
                                    valueOf2 = Integer.valueOf(e2.m());
                                }
                                com.ss.android.ugc.tools.f.b a4 = a3.a("creator_followers", valueOf2);
                                if (!l.f115658a.z().j()) {
                                    str = "1";
                                }
                                r.a("mission_requirement_modified", a4.a("creator_type", str).f149193a);
                                hashTagMentionEditText.f132577i.a(com.ss.android.ugc.aweme.port.in.c.f115633l.a(hashTagMentionEditText.f132577i.a(), a2));
                                return;
                            }
                            i5 = 1;
                        }
                    }
                    if (!(a2.isUserToasted() || a2.getMentionedUsers() == null || a2.getMentionedUsers().isEmpty())) {
                        Iterator<MissionUser> it = a2.getMentionedUsers().iterator();
                        while (it.hasNext()) {
                            if (TextUtils.equals(substring, "@" + it.next().getNickname())) {
                                a2.setUserToasted(true);
                                com.ss.android.ugc.tools.f.b a5 = new com.ss.android.ugc.tools.f.b().a("value", 2).a("mission_id", a2.getMissionId()).a("page_source", a2.getEnterFrom());
                                if (e2 == null) {
                                    valueOf = str;
                                } else {
                                    valueOf = Integer.valueOf(e2.m());
                                }
                                com.ss.android.ugc.tools.f.b a6 = a5.a("creator_followers", valueOf);
                                if (!l.f115658a.z().j()) {
                                    str = "1";
                                }
                                r.a("mission_requirement_modified", a6.a("creator_type", str).f149193a);
                                hashTagMentionEditText.f132577i.a(com.ss.android.ugc.aweme.port.in.c.f115633l.a(hashTagMentionEditText.f132577i.a(), a2));
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    public void setAVTextExtraList(List<AVTextExtraStruct> list) {
        setTextExtraList(f.a(list));
    }

    private void b(Editable editable) {
        if (!d(editable)) {
            editable.removeSpan(this.f132570b);
            this.f132570b = null;
            b();
        }
    }

    private void c(Editable editable) {
        if (!e(editable)) {
            editable.removeSpan(this.f132571c);
            this.f132571c = null;
            b();
        }
    }

    public final void a(InputFilter inputFilter) {
        if (this.K == null) {
            this.K = new ArrayList();
        }
        this.K.add(inputFilter);
        setFilters((InputFilter[]) this.K.toArray(new InputFilter[0]));
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.S = false;
        }
        if (this.S) {
            motionEvent.setAction(3);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (!this.S) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return onTouchEvent;
    }

    public void setEmoticonFilter(int i2) {
        InputFilter inputFilter = this.Q;
        if (inputFilter != null) {
            b(inputFilter);
        }
        as.f132231a = i2;
        com.ss.android.ugc.aweme.ba.b bVar = new com.ss.android.ugc.aweme.ba.b(as.a(), this);
        this.Q = bVar;
        a(bVar);
    }

    private boolean d(Editable editable) {
        if (this.f132570b == null) {
            return false;
        }
        for (MentionEditText.MentionSpan mentionSpan : (MentionEditText.MentionSpan[]) editable.getSpans(0, editable.length(), MentionEditText.MentionSpan.class)) {
            if (!TextUtils.isEmpty(mentionSpan.f132607e)) {
                return true;
            }
        }
        return false;
    }

    private boolean e(Editable editable) {
        if (this.f132571c == null) {
            return false;
        }
        for (MentionEditText.MentionSpan mentionSpan : (MentionEditText.MentionSpan[]) editable.getSpans(0, editable.length(), MentionEditText.MentionSpan.class)) {
            if (mentionSpan.f132608f == 2) {
                return true;
            }
        }
        return false;
    }

    public void setFixLengthInFront(String str) {
        int length;
        InputFilter inputFilter = this.f132576h;
        if (inputFilter != null) {
            b(inputFilter);
        }
        if (!TextUtils.isEmpty(str) && length() >= (length = str.length())) {
            com.ss.android.ugc.aweme.ba.a aVar = new com.ss.android.ugc.aweme.ba.a(new h(this), this, length);
            this.f132576h = aVar;
            a(aVar);
            this.L = new b(length) {
                /* class com.ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText.AnonymousClass3 */

                /* renamed from: a  reason: collision with root package name */
                int f132584a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ int f132585b;

                static {
                    Covode.recordClassIndex(86761);
                }

                {
                    this.f132585b = r2;
                    this.f132584a = r2;
                }

                @Override // com.ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText.b
                public final void a(int i2, int i3) {
                    if (i2 != 0 || i3 != HashTagMentionEditText.this.length()) {
                        if (i2 < this.f132585b) {
                            HashTagMentionEditText.this.setSelection(this.f132584a);
                        } else {
                            this.f132584a = i2;
                        }
                    }
                }
            };
        }
    }

    private static String a(Editable editable) {
        StringBuilder sb = new StringBuilder(editable.toString());
        o[] oVarArr = (o[]) editable.getSpans(0, editable.length(), o.class);
        if (oVarArr.length > 0) {
            int length = oVarArr.length;
            int[] iArr = new int[length];
            for (int i2 = 0; i2 < length; i2++) {
                iArr[i2] = editable.getSpanStart(oVarArr[i2]);
            }
            Arrays.sort(iArr);
            for (int i3 = length - 1; i3 >= 0; i3--) {
                sb.delete(iArr[i3], iArr[i3] + 1);
            }
        }
        return sb.toString();
    }

    private void b(InputFilter inputFilter) {
        List<InputFilter> list = this.K;
        if (list != null) {
            list.remove(inputFilter);
            setFilters((InputFilter[]) this.K.toArray(new InputFilter[0]));
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.view.MentionEditText, com.ss.android.ugc.aweme.services.publish.IAVMentionEditText
    public void addHashTag(String str) {
        if (TextUtils.isEmpty(this.f132575g)) {
            this.f132575g = " ".concat(String.valueOf(str));
            getText().insert(Math.max(getSelectionEnd(), getText().length()), this.f132575g);
            getText().setSpan(new MentionEditText.AdSpan(androidx.core.content.b.c(getContext(), R.color.c5)), getCurAdTagStart(), getText().length(), 33);
            a(this.f132579k);
            this.N = true;
        }
    }

    /* access modifiers changed from: package-private */
    public final String c(String str) {
        int length = str.length();
        if (!TextUtils.isEmpty(str)) {
            int i2 = length - 1;
            int length2 = str.length();
            while (i2 >= 0) {
                char charAt = str.charAt(i2);
                if (charAt != ' ' && !String.valueOf(charAt).equals(getContext().getString(R.string.g2t)) && charAt != '@' && charAt != '\n') {
                    if (charAt == '#') {
                        break;
                    }
                    i2--;
                } else {
                    return "";
                }
            }
            while (length < length2) {
                char charAt2 = str.charAt(length);
                if (charAt2 == '#' || charAt2 == ' ' || String.valueOf(charAt2).equals(getContext().getString(R.string.g2t)) || charAt2 == '@' || charAt2 == '\n') {
                    break;
                }
                length++;
            }
            if (i2 >= 0 && length <= length2 && i2 < length) {
                return str.substring(i2, length);
            }
        }
        return "";
    }

    public final List<com.ss.android.ugc.aweme.video.hashtag.a> b(String str) {
        int indexOf;
        boolean z;
        HashSet hashSet = new HashSet();
        int i2 = 0;
        for (String str2 : dj.a(str, dj.a())) {
            int indexOf2 = str.indexOf(str2, i2);
            if (indexOf2 >= 0) {
                Iterator it = this.C.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (indexOf2 == str.indexOf((String) it.next(), i2)) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                i2 = str2.length() + indexOf2;
                if (!z) {
                    hashSet.add(new com.ss.android.ugc.aweme.video.hashtag.a(str2, indexOf2, i2));
                }
            }
        }
        for (String str3 : this.C) {
            int i3 = 0;
            while (i3 < str.length() && (indexOf = str.indexOf(str3, i3)) >= 0) {
                i3 = str3.length() + indexOf;
                hashSet.add(new com.ss.android.ugc.aweme.video.hashtag.a(str3, indexOf, i3));
            }
        }
        ArrayList arrayList = new ArrayList(hashSet);
        Collections.sort(arrayList, new a.C3821a());
        return arrayList;
    }

    private void f(Editable editable) {
        String substring;
        MentionEditText.MentionSpan[] mentionSpanArr;
        boolean z;
        int i2;
        if (editable != null) {
            System.currentTimeMillis();
            ArrayList<r> arrayList = new ArrayList();
            if (TextUtils.isEmpty(this.f132575g)) {
                substring = editable.toString();
            } else {
                substring = editable.toString().substring(0, getCurAdTagStart());
            }
            for (com.ss.android.ugc.aweme.video.hashtag.a aVar : b(substring)) {
                arrayList.add(new r(aVar.f143394a, aVar.f143395b));
            }
            ArrayList<r> arrayList2 = new ArrayList(arrayList);
            if (this.r != null && !this.r.isEmpty()) {
                arrayList2.addAll(this.r);
            }
            Collections.sort(arrayList2, g.f132655a);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (r rVar : arrayList) {
                if (rVar.a(getSelectionStart() - 1, getSelectionEnd() - 1) || rVar.a(getSelectionStart() + 1, getSelectionEnd() + 1)) {
                    spannableStringBuilder.append((CharSequence) substring.substring(rVar.f132667a, rVar.f132668b));
                    int indexOf = arrayList.indexOf(rVar);
                    if (TextUtils.isEmpty(editable.toString())) {
                        mentionSpanArr = null;
                    } else {
                        mentionSpanArr = (MentionEditText.MentionSpan[]) editable.getSpans(0, getNoAdTagText().length(), MentionEditText.MentionSpan.class);
                        Arrays.sort(mentionSpanArr, new m(editable));
                    }
                    if (indexOf < 0 || indexOf >= mentionSpanArr.length) {
                        z = false;
                        i2 = this.n;
                    } else {
                        z = mentionSpanArr[indexOf].f132606d.isStarAtlasTag();
                        if (z) {
                            i2 = this.o;
                        }
                        i2 = this.n;
                    }
                    MentionEditText.MentionSpan mentionSpan = new MentionEditText.MentionSpan(i2, spannableStringBuilder.toString(), "", 1, "", "");
                    mentionSpan.a(z);
                    a(editable, rVar.f132667a, rVar.f132668b, false);
                    editable.setSpan(mentionSpan, rVar.f132667a, rVar.f132668b, 33);
                    editable.setSpan(new StyleSpan(1), rVar.f132667a, rVar.f132668b, 33);
                    spannableStringBuilder.clear();
                }
            }
            int length = substring.length();
            int i3 = 0;
            for (r rVar2 : arrayList2) {
                if (i3 >= 0 && rVar2.f132667a <= length && i3 <= rVar2.f132667a) {
                    a(editable, i3, rVar2.f132667a, false);
                    i3 = rVar2.f132668b;
                }
            }
            if (i3 <= length) {
                a(editable, i3, length, false);
            }
            if (editable.length() != 0) {
                b(editable);
                c(editable);
            }
            com.ss.android.ugc.aweme.framework.a.a.b("MentionEditText", "full: \n  text: " + getText().toString() + " and se: " + getSelectionEnd());
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.view.MentionEditText
    public void setTextExtraList(List<TextExtraStruct> list) {
        MethodCollector.i(8730);
        super.setTextExtraList(list);
        Editable text = getText();
        if (text == null || TextUtils.isEmpty(getNoAdTagText())) {
            MethodCollector.o(8730);
            return;
        }
        int length = getNoAdTagText().length();
        if (com.bytedance.common.utility.collection.b.a((Collection) list)) {
            MethodCollector.o(8730);
            return;
        }
        for (TextExtraStruct textExtraStruct : list) {
            if (textExtraStruct != null) {
                if (textExtraStruct.getType() == 1) {
                    if (textExtraStruct.getStart() <= length && textExtraStruct.getEnd() <= length && textExtraStruct.getStart() <= textExtraStruct.getEnd()) {
                        a(textExtraStruct, text);
                    }
                }
                if (((textExtraStruct.getType() == 0 && !TextUtils.isEmpty(textExtraStruct.getAwemeId())) || (textExtraStruct.getType() == 5 && !TextUtils.isEmpty(textExtraStruct.getAwemeId()))) && textExtraStruct.getStart() <= length && textExtraStruct.getEnd() <= length && textExtraStruct.getStart() <= textExtraStruct.getEnd()) {
                    if (textExtraStruct.getEnd() < length && text.charAt(textExtraStruct.getEnd()) == 160) {
                        text.replace(textExtraStruct.getEnd(), textExtraStruct.getEnd() + 1, " ");
                    }
                    if (textExtraStruct.getSubtype() == 1 || textExtraStruct.getSubtype() == 6) {
                        com.ss.android.ugc.aweme.shortvideo.aa.a aVar = new com.ss.android.ugc.aweme.shortvideo.aa.a(getContext(), this);
                        this.f132570b = aVar;
                        text.setSpan(aVar, textExtraStruct.getStart(), textExtraStruct.getEnd(), 33);
                        this.f132569a++;
                    }
                    if (textExtraStruct.getSubtype() == 2) {
                        c cVar = new c(getContext(), this);
                        this.f132571c = cVar;
                        cVar.f124818a = BitmapFactory.decodeResource(getContext().getResources(), 2131233934);
                        text.setSpan(this.f132571c, textExtraStruct.getStart(), textExtraStruct.getEnd(), 33);
                        this.f132572d = 1;
                    }
                }
            }
        }
        MethodCollector.o(8730);
    }

    public final boolean b(int i2) {
        MentionEditText.MentionSpan[] mentionText = getMentionText();
        if (i2 < 0 || i2 >= mentionText.length) {
            return false;
        }
        return mentionText[i2].f132606d.isStarAtlasTag();
    }

    private void b(int i2, int i3) {
        if (i2 < i3 && getText() != null) {
            for (MentionEditText.MentionSpan mentionSpan : (MentionEditText.MentionSpan[]) getText().getSpans(i2, i3, MentionEditText.MentionSpan.class)) {
                getText().removeSpan(mentionSpan);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        this.I = View.MeasureSpec.getSize(i2);
        super.onMeasure(i2, i3);
        int height = getLayout().getHeight();
        int totalPaddingTop = getTotalPaddingTop();
        this.R = ((height + totalPaddingTop) + getTotalPaddingBottom()) - getHeight();
    }

    public HashTagMentionEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!com.ss.android.ugc.aweme.port.in.c.u.a()) {
            a aVar = new a(this, (byte) 0);
            this.O = aVar;
            addTextChangedListener(aVar);
            setOnFocusChangeListener(this.f132578j);
        }
    }

    public final void a(Editable editable, int i2) {
        boolean z;
        c();
        if (!l.f115658a.e().d() && i2 > 0 && editable.charAt(i2 - 1) == '\n') {
            i2--;
        }
        o[] oVarArr = (o[]) editable.getSpans(0, editable.length(), o.class);
        if (oVarArr.length > 0) {
            int length = oVarArr.length;
            int[] iArr = new int[length];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = editable.getSpanStart(oVarArr[i3]);
            }
            Arrays.sort(iArr);
            for (int i4 = length - 1; i4 >= 0; i4--) {
                editable.delete(iArr[i4], iArr[i4] + 1);
                if (i2 >= iArr[i4]) {
                    i2--;
                }
            }
            z = true;
        } else {
            z = false;
        }
        String obj = editable.toString();
        LinkedHashMap<String, Bitmap> d2 = AVCommerceServiceImpl.h().d();
        while (obj.length() > 1) {
            String c2 = c(obj);
            if (c2.isEmpty()) {
                obj = obj.substring(0, obj.length() - 1);
            } else {
                String lowerCase = c2.toLowerCase();
                if (d2 != null && d2.containsKey(lowerCase.substring(1))) {
                    Bitmap bitmap = d2.get(lowerCase.substring(1));
                    if (bitmap != null) {
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
                        bitmapDrawable.setBounds(0, 0, (int) getTextSize(), (int) getTextSize());
                        o oVar = new o(bitmapDrawable);
                        editable.insert(obj.length(), getContext().getString(R.string.g2t));
                        if (editable.length() >= obj.length() + 1) {
                            editable.setSpan(oVar, obj.length(), obj.length() + 1, 33);
                        }
                    }
                    if (i2 > obj.length()) {
                        i2++;
                    }
                    z = true;
                }
                obj = obj.substring(0, obj.length() - c2.length());
            }
        }
        if (z) {
            f(editable);
        }
        d();
        if (z) {
            this.f132580l = true;
            this.f132581m = i2;
            setCursorVisible(false);
            com.ss.android.ugc.aweme.ba.a aVar = this.f132576h;
            if (aVar != null) {
                b(aVar);
            }
            if (this.N.booleanValue()) {
                b(this.f132579k);
            }
            setText(editable);
            if (i2 >= editable.length()) {
                i2 = editable.length();
            }
            if (this.f132576h != null) {
                post(new i(this));
            }
            if (this.N.booleanValue()) {
                post(new j(this));
            }
            post(new k(this, i2, editable));
            post(new l(this));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.shortvideo.view.MentionEditText
    public void onSelectionChanged(int i2, int i3) {
        Object valueOf;
        Object valueOf2;
        super.onSelectionChanged(i2, i3);
        if (!this.s) {
            b bVar = this.L;
            if (bVar != null) {
                bVar.a(i2, i3);
            }
            if (getText() != null && i2 >= 0 && i3 >= 0 && i2 < i3) {
                String charSequence = getText().subSequence(i2, i3).toString();
                com.ss.android.ugc.aweme.account.model.a e2 = com.ss.android.ugc.aweme.port.in.c.u.e();
                if (this.f132577i != null) {
                    Mission a2 = com.ss.android.ugc.aweme.port.in.c.f115633l.a(this.f132577i.a());
                    String str = "0";
                    if (!a2.isChallengeToasted() && a2.getChallengeNames() != null && !a2.getChallengeNames().isEmpty()) {
                        boolean z = false;
                        for (String str2 : a2.getChallengeNames()) {
                            if (charSequence.length() > 1 && TextUtils.equals(String.valueOf(charSequence.charAt(charSequence.length() - 1)), getContext().getString(R.string.g2t))) {
                                z = TextUtils.equals(c(getNoAdTagText().substring(0, i3 - 1)), "#".concat(String.valueOf(str2)));
                            }
                            if (!TextUtils.equals(charSequence, "#".concat(String.valueOf(str2)))) {
                                if (z) {
                                }
                            }
                            new com.ss.android.ugc.aweme.tux.a.i.a(com.ss.android.ugc.aweme.df.b.a()).a(R.string.d53).a();
                            com.ss.android.ugc.tools.f.b a3 = new com.ss.android.ugc.tools.f.b().a("reason", 3).a("mission_id", a2.getMissionId()).a("page_source", a2.getEnterFrom());
                            if (e2 == null) {
                                valueOf2 = str;
                            } else {
                                valueOf2 = Integer.valueOf(e2.m());
                            }
                            com.ss.android.ugc.tools.f.b a4 = a3.a("creator_followers", valueOf2);
                            if (!l.f115658a.z().j()) {
                                str = "1";
                            }
                            r.a("mission_requirement_toast", a4.a("creator_type", str).f149193a);
                            return;
                        }
                    }
                    if (!(a2.isUserToasted() || a2.getMentionedUsers() == null || a2.getMentionedUsers().isEmpty())) {
                        for (MissionUser missionUser : a2.getMentionedUsers()) {
                            if (charSequence.contains(missionUser.getNickname())) {
                                new com.ss.android.ugc.aweme.tux.a.i.a(com.ss.android.ugc.aweme.df.b.a()).a(R.string.d51).a();
                                com.ss.android.ugc.tools.f.b a5 = new com.ss.android.ugc.tools.f.b().a("reason", 2).a("mission_id", a2.getMissionId()).a("page_source", a2.getEnterFrom());
                                if (e2 == null) {
                                    valueOf = str;
                                } else {
                                    valueOf = Integer.valueOf(e2.m());
                                }
                                com.ss.android.ugc.tools.f.b a6 = a5.a("creator_followers", valueOf);
                                if (!l.f115658a.z().j()) {
                                    str = "1";
                                }
                                r.a("mission_requirement_toast", a6.a("creator_type", str).f149193a);
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x009d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.model.TextExtraStruct r13, android.text.Editable r14) {
        /*
        // Method dump skipped, instructions count: 186
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText.a(com.ss.android.ugc.aweme.model.TextExtraStruct, android.text.Editable):void");
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.shortvideo.view.MentionEditText
    public final void a(MentionEditText.MentionSpan mentionSpan, r rVar) {
        if (AVCommerceServiceImpl.h().a(mentionSpan.f132604b) != null && getNoAdTagText().length() > rVar.f132668b && String.valueOf(getNoAdTagText().charAt(rVar.f132668b)).equals(getContext().getString(R.string.g2t))) {
            this.r.add(new r(rVar.f132668b - 1, rVar.f132668b + 1));
        }
        if (!TextUtils.isEmpty(mentionSpan.f132604b) && !this.M.contains(mentionSpan.f132604b) && this.C.contains(mentionSpan.f132604b)) {
            this.r.add(rVar);
        }
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
        if (i3 == this.R || i3 == 0) {
            getParent().requestDisallowInterceptTouchEvent(false);
            this.S = true;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.shortvideo.view.MentionEditText
    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        String charSequence2;
        super.onTextChanged(charSequence, i2, i3, i4);
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence.toString();
        }
        for (String str : this.C) {
            if (!charSequence2.contains(str)) {
                this.M.add(str);
            }
        }
    }

    private static void a(Editable editable, int i2, int i3, boolean z) {
        if (i2 < i3 && editable != null) {
            MentionEditText.MentionSpan[] mentionSpanArr = (MentionEditText.MentionSpan[]) editable.getSpans(i2, i3, MentionEditText.MentionSpan.class);
            for (MentionEditText.MentionSpan mentionSpan : mentionSpanArr) {
                if (editable.getSpanEnd(mentionSpan) < editable.length() && editable.getSpanStart(mentionSpan) >= 0) {
                    if (z) {
                        ALog.d("MentionEditText", "oldSpan: " + mentionSpan.f132604b + " oldSpan.start:" + editable.getSpanStart(mentionSpan) + " oldSpan.end:" + editable.getSpanEnd(mentionSpan) + "\n editable: " + editable.toString() + " editable.length: " + editable.length());
                    }
                    editable.removeSpan(mentionSpan);
                }
            }
        }
    }
}
