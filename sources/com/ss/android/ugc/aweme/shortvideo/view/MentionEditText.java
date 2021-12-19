package com.ss.android.ugc.aweme.shortvideo.view;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.ui.widget.DmtEditText;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.port.in.ay;
import com.ss.android.ugc.aweme.services.publish.IAVMentionEditText;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.util.w;
import com.ss.android.ugc.tools.utils.q;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MentionEditText extends DmtEditText implements IAVMentionEditText {
    public c A;
    protected List<TextWatcher> B = new ArrayList();
    public Set<String> C = new HashSet();
    public View.OnKeyListener D;

    /* renamed from: a  reason: collision with root package name */
    private Runnable f132592a;

    /* renamed from: b  reason: collision with root package name */
    private int f132593b;

    /* renamed from: c  reason: collision with root package name */
    private int f132594c = -1;

    /* renamed from: d  reason: collision with root package name */
    private int f132595d = -1;

    /* renamed from: e  reason: collision with root package name */
    private String f132596e;

    /* renamed from: f  reason: collision with root package name */
    private VideoPublishEditModel f132597f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f132598g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f132599h;
    protected int n = -65536;
    protected int o;
    public boolean p;
    public r q;
    protected List<r> r = new ArrayList(5);
    public boolean s;
    public int t;
    public int u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public interface c {
        static {
            Covode.recordClassIndex(86772);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(86764);
    }

    public void a() {
    }

    public void a(int i2) {
    }

    /* access modifiers changed from: protected */
    public void a(MentionSpan mentionSpan, r rVar) {
    }

    public void a(String str) {
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVMentionEditText
    public void addHashTag(String str) {
    }

    public String getAdTag() {
        return "";
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVMentionEditText
    public void removeHashTag() {
    }

    public int getPasteEnd() {
        return this.f132595d;
    }

    public int getPasteStart() {
        return this.f132594c;
    }

    public String getPasteUrl() {
        return this.f132596e;
    }

    public int getUrlEnd() {
        return this.u;
    }

    public int getUrlStart() {
        return this.t;
    }

    public VideoPublishEditModel getVideoPublishEditModel() {
        return this.f132597f;
    }

    /* access modifiers changed from: protected */
    public List<TextExtraStruct> getCompatTextExtraStructList() {
        return getTextExtraStructList();
    }

    public static class MentionSavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<MentionSavedState> CREATOR = new Parcelable.Creator<MentionSavedState>() {
            /* class com.ss.android.ugc.aweme.shortvideo.view.MentionEditText.MentionSavedState.AnonymousClass1 */

            static {
                Covode.recordClassIndex(86767);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ MentionSavedState[] newArray(int i2) {
                return new MentionSavedState[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ MentionSavedState createFromParcel(Parcel parcel) {
                return a(parcel);
            }

            private static MentionSavedState a(Parcel parcel) {
                try {
                    return new MentionSavedState(parcel, (byte) 0);
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return null;
                }
            }
        };

        /* renamed from: a  reason: collision with root package name */
        public String f132600a;

        /* renamed from: b  reason: collision with root package name */
        public int f132601b;

        /* renamed from: c  reason: collision with root package name */
        public List<TextExtraStruct> f132602c;

        static {
            Covode.recordClassIndex(86766);
        }

        public MentionSavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private MentionSavedState(Parcel parcel) {
            super(parcel);
            this.f132600a = parcel.readString();
            this.f132601b = parcel.readInt();
            Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
            if (readBundle != null) {
                this.f132602c = readBundle.getParcelableArrayList("text_extra_struct");
            }
        }

        /* synthetic */ MentionSavedState(Parcel parcel, byte b2) {
            this(parcel);
        }

        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeString(this.f132600a);
            parcel.writeInt(this.f132601b);
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("text_extra_struct", (ArrayList) this.f132602c);
            parcel.writeBundle(bundle);
        }
    }

    public static class MentionSpan extends ForegroundColorSpan {
        public static final Parcelable.Creator<MentionSpan> CREATOR = new Parcelable.Creator<MentionSpan>() {
            /* class com.ss.android.ugc.aweme.shortvideo.view.MentionEditText.MentionSpan.AnonymousClass1 */

            static {
                Covode.recordClassIndex(86769);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ MentionSpan[] newArray(int i2) {
                return new MentionSpan[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ MentionSpan createFromParcel(Parcel parcel) {
                return new MentionSpan(parcel);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        public String f132603a;

        /* renamed from: b  reason: collision with root package name */
        public String f132604b;

        /* renamed from: c  reason: collision with root package name */
        public int f132605c;

        /* renamed from: d  reason: collision with root package name */
        public TextExtraStruct f132606d;

        /* renamed from: e  reason: collision with root package name */
        public String f132607e = "";

        /* renamed from: f  reason: collision with root package name */
        public int f132608f;

        /* renamed from: g  reason: collision with root package name */
        public String f132609g = "";

        public int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(86768);
        }

        public int hashCode() {
            int i2;
            int i3;
            int i4;
            int i5;
            String str = this.f132603a;
            int i6 = 0;
            if (str != null) {
                i2 = str.hashCode();
            } else {
                i2 = 0;
            }
            int i7 = i2 * 31;
            String str2 = this.f132604b;
            if (str2 != null) {
                i3 = str2.hashCode();
            } else {
                i3 = 0;
            }
            int i8 = (((i7 + i3) * 31) + this.f132605c) * 31;
            TextExtraStruct textExtraStruct = this.f132606d;
            if (textExtraStruct != null) {
                i4 = textExtraStruct.hashCode();
            } else {
                i4 = 0;
            }
            int i9 = (i8 + i4) * 31;
            String str3 = this.f132607e;
            if (str3 != null) {
                i5 = str3.hashCode();
            } else {
                i5 = 0;
            }
            int i10 = (((i9 + i5) * 31) + this.f132608f) * 31;
            String str4 = this.f132609g;
            if (str4 != null) {
                i6 = str4.hashCode();
            }
            return i10 + i6;
        }

        public final void a(int i2) {
            this.f132608f = i2;
            this.f132606d.setSubType(i2);
        }

        public final void a(String str) {
            this.f132607e = str;
            this.f132606d.setAwemeId(str);
        }

        public final void a(boolean z) {
            this.f132606d.setStarAtlasTag(z);
        }

        protected MentionSpan(Parcel parcel) {
            super(parcel);
            this.f132603a = parcel.readString();
            this.f132604b = parcel.readString();
            this.f132605c = parcel.readInt();
            this.f132606d = (TextExtraStruct) parcel.readParcelable(TextExtraStruct.class.getClassLoader());
            this.f132609g = parcel.readString();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                MentionSpan mentionSpan = (MentionSpan) obj;
                if (this.f132605c != mentionSpan.f132605c || this.f132608f != mentionSpan.f132608f) {
                    return false;
                }
                String str = this.f132603a;
                if (str == null ? mentionSpan.f132603a != null : !str.equals(mentionSpan.f132603a)) {
                    return false;
                }
                String str2 = this.f132604b;
                if (str2 == null ? mentionSpan.f132604b != null : !str2.equals(mentionSpan.f132604b)) {
                    return false;
                }
                TextExtraStruct textExtraStruct = this.f132606d;
                if (textExtraStruct == null ? mentionSpan.f132606d != null : !textExtraStruct.equals(mentionSpan.f132606d)) {
                    return false;
                }
                String str3 = this.f132607e;
                if (str3 == null ? mentionSpan.f132607e != null : !str3.equals(mentionSpan.f132607e)) {
                    return false;
                }
                String str4 = this.f132609g;
                String str5 = mentionSpan.f132609g;
                if (str4 != null) {
                    return str4.equals(str5);
                }
                if (str5 == null) {
                    return true;
                }
            }
            return false;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.f132603a);
            parcel.writeString(this.f132604b);
            parcel.writeInt(this.f132605c);
            parcel.writeParcelable(this.f132606d, i2);
            parcel.writeString(this.f132609g);
        }

        public MentionSpan(int i2, String str, String str2, int i3, String str3, String str4) {
            super(i2);
            this.f132603a = str2;
            this.f132604b = str;
            this.f132605c = i3;
            this.f132609g = str4;
            TextExtraStruct textExtraStruct = new TextExtraStruct();
            this.f132606d = textExtraStruct;
            textExtraStruct.setUserId(str2);
            this.f132606d.setType(i3);
            this.f132606d.setAtUserType(str3);
            this.f132606d.setSecUid(str4);
        }
    }

    public int getMentionTextCount() {
        MentionSpan[] mentionText = getMentionText();
        if (mentionText == null) {
            return 0;
        }
        return mentionText.length;
    }

    public String getNoAdTagText() {
        return getText().toString();
    }

    static class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<MentionEditText> f132613a;

        static {
            Covode.recordClassIndex(86773);
        }

        public final void run() {
            MentionEditText mentionEditText = this.f132613a.get();
            if (mentionEditText != null) {
                mentionEditText.setSelection(mentionEditText.getText().length());
            }
        }

        d(MentionEditText mentionEditText) {
            this.f132613a = new WeakReference<>(mentionEditText);
        }
    }

    /* access modifiers changed from: protected */
    public final void c() {
        for (TextWatcher textWatcher : this.B) {
            super.removeTextChangedListener(textWatcher);
        }
    }

    /* access modifiers changed from: protected */
    public final void d() {
        for (TextWatcher textWatcher : this.B) {
            super.addTextChangedListener(textWatcher);
        }
    }

    public MentionSpan[] getMentionText() {
        Editable text = getText();
        if (text == null || TextUtils.isEmpty(text.toString())) {
            return null;
        }
        MentionSpan[] mentionSpanArr = (MentionSpan[]) text.getSpans(0, getNoAdTagText().length(), MentionSpan.class);
        Arrays.sort(mentionSpanArr, new p(text));
        return mentionSpanArr;
    }

    public ArrayList<TextExtraStruct> getTextExtraStructList() {
        Editable text = getText();
        if (text == null || TextUtils.isEmpty(text.toString())) {
            return null;
        }
        ArrayList<TextExtraStruct> arrayList = new ArrayList<>();
        MentionSpan[] mentionText = getMentionText();
        for (MentionSpan mentionSpan : mentionText) {
            if (mentionSpan.f132605c == 0) {
                mentionSpan.f132606d.setStart(text.getSpanStart(mentionSpan));
                mentionSpan.f132606d.setEnd(text.getSpanEnd(mentionSpan));
                arrayList.add(mentionSpan.f132606d);
            }
        }
        return arrayList;
    }

    public Parcelable onSaveInstanceState() {
        MentionSavedState mentionSavedState = new MentionSavedState(super.onSaveInstanceState());
        mentionSavedState.f132600a = getNoAdTagText();
        mentionSavedState.f132601b = Math.max(getSelectionEnd(), 0);
        mentionSavedState.f132602c = getCompatTextExtraStructList();
        return mentionSavedState;
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVMentionEditText
    public ArrayList<TextExtraStruct> getStarAtlasExtraList() {
        Editable text = getText();
        if (text == null || TextUtils.isEmpty(text.toString())) {
            return null;
        }
        ArrayList<TextExtraStruct> arrayList = new ArrayList<>();
        MentionSpan[] mentionText = getMentionText();
        for (MentionSpan mentionSpan : mentionText) {
            if (mentionSpan.f132606d.isStarAtlasTag()) {
                mentionSpan.f132606d.setStart(text.getSpanStart(mentionSpan));
                mentionSpan.f132606d.setEnd(text.getSpanEnd(mentionSpan));
                arrayList.add(mentionSpan.f132606d);
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVMentionEditText
    public void removeStarAtlas() {
        if (getStarAtlasExtraList() != null && getText() != null) {
            Boolean.valueOf(false);
            a();
            a(0);
            Iterator<TextExtraStruct> it = getStarAtlasExtraList().iterator();
            while (it.hasNext()) {
                TextExtraStruct next = it.next();
                if (next.isStarAtlasTag()) {
                    if (getText().charAt(next.getEnd()) == ' ') {
                        getText().replace(next.getStart(), next.getEnd() + 1, "");
                    } else {
                        getText().replace(next.getStart(), next.getEnd(), "");
                    }
                }
            }
            Boolean.valueOf(false);
            a((String) null);
        }
    }

    public static class AdSpan extends ForegroundColorSpan {
        static {
            Covode.recordClassIndex(86765);
        }

        public AdSpan(int i2) {
            super(i2);
        }
    }

    public void setAddByPaste(boolean z2) {
        this.v = z2;
    }

    public void setAddChainSuccess(boolean z2) {
        this.f132598g = z2;
    }

    public void setAddVideoChain(boolean z2) {
        this.w = z2;
    }

    public void setHasUrlTransforming(boolean z2) {
        this.s = z2;
    }

    public void setMentionTextColor(int i2) {
        this.n = i2;
    }

    public void setMentionTextTypeface(int i2) {
        this.f132593b = i2;
    }

    public void setOnMentionInputListener(c cVar) {
        this.A = cVar;
    }

    public void setPasteEnd(int i2) {
        this.f132595d = i2;
    }

    public void setPasteStart(int i2) {
        this.f132594c = i2;
    }

    public void setPasteUrl(String str) {
        this.f132596e = str;
    }

    public void setRepasteUrl(boolean z2) {
        this.x = z2;
    }

    public void setRepasteUrlSuccess(boolean z2) {
        this.f132599h = z2;
    }

    public void setShouldDisableTrim(boolean z2) {
        this.y = z2;
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVMentionEditText
    public void setStarAtlasMentionTextColor(int i2) {
        this.o = i2;
    }

    public void setTransformingUrlRemoved(boolean z2) {
        this.z = z2;
    }

    public void setUrlEnd(int i2) {
        this.u = i2;
    }

    public void setUrlStart(int i2) {
        this.t = i2;
    }

    public void setVideoPublishEditModel(VideoPublishEditModel videoPublishEditModel) {
        this.f132597f = videoPublishEditModel;
    }

    class b implements TextWatcher {
        static {
            Covode.recordClassIndex(86771);
        }

        public final void afterTextChanged(Editable editable) {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        private b() {
        }

        /* synthetic */ b(MentionEditText mentionEditText, byte b2) {
            this();
        }

        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            if (i4 == 1 && !TextUtils.isEmpty(charSequence) && '@' == charSequence.toString().charAt(i2) && MentionEditText.this.A != null) {
                r.a("click_video_at", new com.ss.android.ugc.tools.f.b().a("enter_from", "video_post_page").a("enter_method", "input").f149193a);
                MentionEditText.this.A.a();
            }
        }
    }

    public void setOnKeyListener(View.OnKeyListener onKeyListener) {
        this.D = onKeyListener;
        super.setOnKeyListener(onKeyListener);
    }

    public void addTextChangedListener(TextWatcher textWatcher) {
        super.addTextChangedListener(textWatcher);
        List<TextWatcher> list = this.B;
        if (list != null && textWatcher != null) {
            list.add(textWatcher);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatEditText
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection == null) {
            return null;
        }
        return new a(onCreateInputConnection, this);
    }

    public void removeTextChangedListener(TextWatcher textWatcher) {
        super.removeTextChangedListener(textWatcher);
        List<TextWatcher> list = this.B;
        if (list != null && textWatcher != null) {
            list.remove(textWatcher);
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof MentionSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        MentionSavedState mentionSavedState = (MentionSavedState) parcelable;
        super.onRestoreInstanceState(mentionSavedState.getSuperState());
        setText(mentionSavedState.f132600a);
        int min = Math.min(mentionSavedState.f132601b, getText().length());
        if (min >= 0) {
            setSelection(min);
        }
        setTextExtraList(mentionSavedState.f132602c);
    }

    class a extends InputConnectionWrapper {

        /* renamed from: b  reason: collision with root package name */
        private EditText f132611b;

        static {
            Covode.recordClassIndex(86770);
        }

        public final boolean sendKeyEvent(KeyEvent keyEvent) {
            if (MentionEditText.this.D != null) {
                return MentionEditText.this.D.onKey(MentionEditText.this, keyEvent.getKeyCode(), keyEvent);
            }
            if (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 67) {
                return super.sendKeyEvent(keyEvent);
            }
            int selectionStart = this.f132611b.getSelectionStart();
            r a2 = MentionEditText.this.a(selectionStart, this.f132611b.getSelectionEnd());
            if (a2 == null) {
                MentionEditText.this.p = false;
                return super.sendKeyEvent(keyEvent);
            } else if (MentionEditText.this.p || selectionStart == a2.f132667a) {
                MentionEditText.this.p = false;
                return super.sendKeyEvent(keyEvent);
            } else {
                MentionEditText.this.p = true;
                MentionEditText.this.q = a2;
                if (Build.VERSION.SDK_INT >= 25) {
                    setSelection(a2.f132667a, a2.f132668b);
                } else {
                    setSelection(a2.f132668b, a2.f132667a);
                }
                return true;
            }
        }

        public final boolean setComposingText(CharSequence charSequence, int i2) {
            EditText editText = this.f132611b;
            if (editText == null || !(editText instanceof MentionEditText) || !((MentionEditText) editText).s) {
                return super.setComposingText(charSequence, i2);
            }
            return false;
        }

        public final boolean commitText(CharSequence charSequence, int i2) {
            try {
                if (MentionEditText.this.s) {
                    return false;
                }
                if (com.ss.android.ugc.aweme.setting.c.a() != 1 || !w.a(charSequence.toString())) {
                    return super.commitText(charSequence, i2);
                }
                MentionEditText mentionEditText = MentionEditText.this;
                String charSequence2 = charSequence.toString();
                if (!TextUtils.isEmpty(charSequence2)) {
                    mentionEditText.setHasUrlTransforming(true);
                    int selectionStart = mentionEditText.getSelectionStart();
                    Editable text = mentionEditText.getText();
                    if (text != null) {
                        SpannableString spannableString = new SpannableString(charSequence2 + " ");
                        spannableString.setSpan(new com.ss.android.ugc.aweme.shortvideo.aa.d(mentionEditText.getContext(), mentionEditText), spannableString.length() - 1, spannableString.length(), 33);
                        if (TextUtils.isEmpty(text)) {
                            text.insert(0, spannableString);
                            mentionEditText.setUrlStart(0);
                            mentionEditText.setUrlEnd(spannableString.length() + 1);
                            text.append((CharSequence) " ");
                        } else {
                            int length = text.length();
                            if (selectionStart <= length && selectionStart >= 0) {
                                int min = Math.min(length, Math.max(0, selectionStart));
                                text.insert(min, spannableString);
                                mentionEditText.setUrlStart(min);
                                mentionEditText.setUrlEnd(spannableString.length() + min + 1);
                                text.insert(Math.min(min + spannableString.length(), text.length()), " ");
                            }
                        }
                        w.a(charSequence.toString(), MentionEditText.this.t, MentionEditText.this.u, MentionEditText.this);
                    }
                }
                return true;
            } catch (NullPointerException e2) {
                e2.printStackTrace();
                return true;
            }
        }

        public final boolean deleteSurroundingText(int i2, int i3) {
            MentionSpan[] mentionSpanArr;
            int i4 = i2;
            int i5 = i3;
            if (i4 == 1) {
                if (i5 == 0) {
                    Editable text = MentionEditText.this.getText();
                    if (text != null && text.length() > 0) {
                        MentionEditText mentionEditText = MentionEditText.this;
                        int length = text.length();
                        int max = Math.max(mentionEditText.getSelectionStart() - i4, 0);
                        int min = Math.min(mentionEditText.getSelectionEnd() + i5, length);
                        CharacterStyle[] characterStyleArr = (CharacterStyle[]) text.getSpans(0, length, CharacterStyle.class);
                        int i6 = max;
                        int i7 = min;
                        boolean z = false;
                        boolean z2 = false;
                        for (CharacterStyle characterStyle : characterStyleArr) {
                            if ((!(characterStyle instanceof MentionSpan) || ((MentionSpan) characterStyle).f132605c != 1) && !(characterStyle instanceof StyleSpan)) {
                                int spanStart = text.getSpanStart(characterStyle);
                                int spanEnd = text.getSpanEnd(characterStyle);
                                if (!z && spanStart <= max && spanEnd > max) {
                                    i6 = spanStart;
                                    z = true;
                                }
                                if (!z2 && spanStart < min && spanEnd >= min) {
                                    i7 = spanEnd;
                                    z2 = true;
                                }
                                if (z && z2) {
                                    break;
                                }
                            }
                        }
                        int[] iArr = {i6, i7};
                        int i8 = iArr[0];
                        int i9 = iArr[1];
                        if (i8 > i9) {
                            i8 = i9;
                            i9 = i8;
                        }
                        r a2 = MentionEditText.this.a(i8, i9);
                        if (a2 == null || (mentionSpanArr = (MentionSpan[]) text.getSpans(a2.f132667a, a2.f132668b, MentionSpan.class)) == null || mentionSpanArr.length <= 0) {
                            text.delete(i8, i9);
                        } else if (!sendKeyEvent(new KeyEvent(0, 67)) || !sendKeyEvent(new KeyEvent(1, 67))) {
                            return false;
                        } else {
                            return true;
                        }
                    }
                    return false;
                }
            } else if (i4 < 0) {
                int i10 = -i5;
                i5 = -i4;
                i4 = i10;
            }
            return super.deleteSurroundingText(i4, i5);
        }

        a(InputConnection inputConnection, MentionEditText mentionEditText) {
            super(inputConnection, true);
            this.f132611b = mentionEditText;
        }
    }

    public final void d(String str) {
        Editable text;
        if (!TextUtils.isEmpty(str) && (text = getText()) != null && text.length() >= str.length() && TextUtils.equals(text.toString().substring(0, str.length()), str)) {
            a(0);
            Boolean.valueOf(true);
            a();
            text.replace(0, str.length(), "");
            Boolean.valueOf(true);
            a((String) null);
        }
    }

    public boolean onTextContextMenuItem(int i2) {
        if (com.ss.android.ugc.aweme.setting.c.a() != 1 || i2 != 16908322) {
            return super.onTextContextMenuItem(i2);
        }
        if (this.s) {
            return false;
        }
        setAddByPaste(true);
        boolean onTextContextMenuItem = super.onTextContextMenuItem(i2);
        if (getPasteUrl() != null && getPasteStart() >= 0) {
            setHasUrlTransforming(true);
            Editable text = getText();
            if (text == null) {
                return false;
            }
            SpannableString spannableString = new SpannableString(getPasteUrl() + " ");
            spannableString.setSpan(new com.ss.android.ugc.aweme.shortvideo.aa.d(getContext(), this), spannableString.length() - 1, spannableString.length(), 33);
            text.replace(getPasteStart(), getPasteEnd(), spannableString);
            setUrlStart(getPasteStart());
            setUrlEnd(getUrlStart() + spannableString.length() + 1);
            text.insert(Math.min(getPasteStart() + spannableString.length(), text.length()), " ");
            w.a(getPasteUrl(), this.t, this.u, this);
        }
        setPasteUrl(null);
        setPasteStart(-1);
        setPasteEnd(-1);
        return onTextContextMenuItem;
    }

    public void setTextExtraList(List<TextExtraStruct> list) {
        Editable text;
        int i2;
        this.p = false;
        List<r> list2 = this.r;
        if (list2 != null) {
            list2.clear();
        }
        if (!(list == null || list.isEmpty() || (text = getText()) == null || TextUtils.isEmpty(text.toString()))) {
            int length = text.length();
            for (TextExtraStruct textExtraStruct : list) {
                if (textExtraStruct.isStarAtlasTag()) {
                    i2 = this.o;
                } else {
                    i2 = this.n;
                }
                if ((textExtraStruct.getType() == 0 || textExtraStruct.getType() == 5) && textExtraStruct.getStart() <= length && textExtraStruct.getEnd() <= length && textExtraStruct.getStart() <= textExtraStruct.getEnd() && textExtraStruct.getStart() >= 0) {
                    MentionSpan mentionSpan = new MentionSpan(i2, text.subSequence(textExtraStruct.getStart(), textExtraStruct.getEnd()).toString(), textExtraStruct.getUserId(), textExtraStruct.getType(), textExtraStruct.getAtUserType(), textExtraStruct.getSecUid());
                    mentionSpan.a(textExtraStruct.isStarAtlasTag());
                    if (!TextUtils.isEmpty(textExtraStruct.getAwemeId())) {
                        mentionSpan.a(textExtraStruct.getAwemeId());
                    }
                    mentionSpan.a(textExtraStruct.getSubtype());
                    text.setSpan(mentionSpan, textExtraStruct.getStart(), textExtraStruct.getEnd(), 33);
                    this.r.add(new r(textExtraStruct.getStart(), textExtraStruct.getEnd()));
                }
            }
        }
    }

    public final r a(int i2, int i3) {
        List<r> list = this.r;
        if (list == null) {
            return null;
        }
        for (r rVar : list) {
            if (rVar.a(i2, i3)) {
                return rVar;
            }
        }
        return null;
    }

    @Override // android.widget.TextView, android.widget.EditText
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        try {
            super.setText(charSequence, bufferType);
        } catch (Exception unused) {
        }
        if (this.f132592a == null) {
            this.f132592a = new d(this);
        }
        if (getText().length() > 0) {
            post(this.f132592a);
        }
    }

    public MentionEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        addTextChangedListener(new b(this, (byte) 0));
        Context context2 = getContext();
        if (context2 != null) {
            int i2 = Build.VERSION.SDK_INT;
            if (context2.getResources().getConfiguration().getLayoutDirection() == 1) {
                int i3 = Build.VERSION.SDK_INT;
                setTextAlignment(5);
                setGravity(getGravity() | 8388611);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onSelectionChanged(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        super.onSelectionChanged(i2, i3);
        String adTag = getAdTag();
        if (!TextUtils.isEmpty(adTag)) {
            int length = getText().length() - adTag.length();
            if (i2 > length) {
                setSelection(length);
            } else if (i3 > length) {
                setSelection(i2, length);
            }
        }
        ArrayList<TextExtraStruct> starAtlasExtraList = getStarAtlasExtraList();
        if (!(starAtlasExtraList == null || starAtlasExtraList.size() == 0 || TextUtils.isEmpty(getNoAdTagText()))) {
            Iterator<TextExtraStruct> it = getStarAtlasExtraList().iterator();
            while (it.hasNext()) {
                TextExtraStruct next = it.next();
                if (i2 < next.getEnd() + 1) {
                    i5 = next.getEnd() + 1;
                } else {
                    i5 = i2;
                }
                if (i3 < next.getEnd() + 1) {
                    i6 = next.getEnd() + 1;
                } else {
                    i6 = i3;
                }
                setSelection(Math.min(i5, getNoAdTagText().length()), Math.min(i6, getNoAdTagText().length()));
            }
        }
        r rVar = this.q;
        if (rVar != null) {
            if (rVar.f132667a != i2 || rVar.f132668b != i3) {
                if (rVar.f132667a == i3 && rVar.f132668b == i2) {
                    return;
                }
            } else {
                return;
            }
        }
        r a2 = a(i2, i3);
        if (a2 != null && a2.f132668b == i3) {
            this.p = false;
        }
        List<r> list = this.r;
        if (list != null) {
            for (r rVar2 : list) {
                if ((i2 > rVar2.f132667a && i2 < rVar2.f132668b) || (i3 > rVar2.f132667a && i3 < rVar2.f132668b)) {
                    if (i2 == i3) {
                        try {
                            if ((i2 - rVar2.f132667a) - (rVar2.f132668b - i2) >= 0) {
                                i4 = rVar2.f132668b;
                            } else {
                                i4 = rVar2.f132667a;
                            }
                            setSelection(i4);
                            return;
                        } catch (IndexOutOfBoundsException e2) {
                            e2.printStackTrace();
                            return;
                        }
                    } else {
                        if (i3 < rVar2.f132668b) {
                            setSelection(i2, rVar2.f132668b);
                        }
                        if (i2 > rVar2.f132667a) {
                            setSelection(rVar2.f132667a, i3);
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    public final boolean a(String str, String str2, String str3) {
        return a(0, str, str2, "", str3, false);
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        this.p = false;
        List<r> list = this.r;
        if (list != null) {
            list.clear();
        }
        Editable text = getText();
        if (!(text == null || TextUtils.isEmpty(text.toString()))) {
            MentionSpan[] mentionText = getMentionText();
            for (MentionSpan mentionSpan : mentionText) {
                r rVar = new r(text.getSpanStart(mentionSpan), text.getSpanEnd(mentionSpan));
                if (!TextUtils.equals(text.subSequence(rVar.f132667a, rVar.f132668b).toString(), mentionSpan.f132604b)) {
                    text.removeSpan(mentionSpan);
                } else {
                    if (mentionSpan.f132605c == 0 || mentionSpan.f132605c == 5) {
                        this.r.add(rVar);
                    }
                    a(mentionSpan, rVar);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVMentionEditText
    public boolean addMentionText(int i2, String str, String str2, String str3, boolean z2) {
        return a(i2, str, str2, "", str3, z2);
    }

    public final boolean a(String str, boolean z2, int i2, com.ss.android.ugc.aweme.publish.api.c cVar, String str2) {
        String str3;
        int i3 = i2;
        if (this.z) {
            this.z = false;
            return false;
        } else if (cVar == null) {
            setRepasteUrl(true);
            getText().insert(i3, str2);
            if (this.f132599h && !TextUtils.isEmpty(str)) {
                if ("timeout".equals(str)) {
                    new com.bytedance.tux.g.b(this).e(R.string.gcp).b();
                } else {
                    new com.bytedance.tux.g.b(this).a(str).b();
                }
                this.f132599h = false;
            }
            return false;
        } else {
            Editable text = getText();
            if (text == null) {
                return false;
            }
            setAddVideoChain(true);
            StringBuilder append = new StringBuilder().append("@");
            l.d(cVar, "");
            ay ayVar = com.ss.android.ugc.aweme.port.in.c.f115628g;
            l.b(ayVar, "");
            Boolean b2 = ayVar.b();
            l.b(b2, "");
            if (b2.booleanValue()) {
                str3 = cVar.f118618c;
            } else {
                str3 = cVar.f118622g;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(append.append(str3).toString());
            MentionSpan mentionSpan = new MentionSpan(this.n, spannableStringBuilder.toString(), Long.toString(cVar.f118617b), 5, " ", cVar.f118619d);
            mentionSpan.a(Long.toString(cVar.f118616a));
            mentionSpan.a(6);
            spannableStringBuilder.setSpan(mentionSpan, 0, spannableStringBuilder.length(), 33);
            if (this.f132593b != 0) {
                spannableStringBuilder.setSpan(new StyleSpan(this.f132593b), 0, spannableStringBuilder.length(), 33);
            }
            spannableStringBuilder.setSpan(new com.ss.android.ugc.aweme.shortvideo.aa.a(getContext(), this), 0, spannableStringBuilder.length(), 33);
            mentionSpan.a(false);
            String str4 = "paste_long";
            if (i3 == 0) {
                text.insert(0, spannableStringBuilder);
                text.append((CharSequence) " ");
                if (this.f132598g && !TextUtils.isEmpty(str)) {
                    new com.bytedance.tux.g.b(this).a(str).b();
                    this.f132598g = false;
                }
                VideoPublishEditModel videoPublishEditModel = this.f132597f;
                if (!z2) {
                    str4 = "paste_short";
                }
                w.a(videoPublishEditModel, str4, cVar.f118620e, cVar.f118621f);
                return true;
            }
            int length = text.length();
            if (i3 <= length && i3 >= 0) {
                int i4 = i3 - 1;
                if (TextUtils.equals(text.subSequence(i4, i3), "@")) {
                    text.delete(i4, i3);
                    i3--;
                    length--;
                }
                int min = Math.min(length, Math.max(0, i3));
                text.insert(min, spannableStringBuilder);
                text.insert(Math.min(min + spannableStringBuilder.length(), text.length()), " ");
                if (this.f132598g && !TextUtils.isEmpty(str)) {
                    new com.bytedance.tux.g.b(this).a(str).b();
                    this.f132598g = false;
                }
                VideoPublishEditModel videoPublishEditModel2 = this.f132597f;
                if (!z2) {
                    str4 = "paste_short";
                }
                w.a(videoPublishEditModel2, str4, cVar.f118620e, cVar.f118621f);
            }
            return true;
        }
    }

    private boolean a(int i2, String str, String str2, String str3, String str4, boolean z2) {
        int selectionStart;
        String str5;
        int i3;
        if (this.s) {
            return false;
        }
        if (z2) {
            selectionStart = 0;
        } else {
            selectionStart = getSelectionStart();
        }
        Editable text = getText();
        if (text == null) {
            return false;
        }
        if (i2 == 0) {
            str5 = "@";
        } else if (i2 == 1) {
            str5 = "#";
        } else {
            str5 = "";
        }
        SpannableString spannableString = new SpannableString(str5 + str);
        if (z2) {
            i3 = this.o;
        } else {
            i3 = this.n;
        }
        MentionSpan mentionSpan = new MentionSpan(i3, spannableString.toString(), str2, i2, str3, str4);
        spannableString.setSpan(mentionSpan, 0, spannableString.length(), 33);
        if (this.f132593b != 0) {
            spannableString.setSpan(new StyleSpan(this.f132593b), 0, spannableString.length(), 33);
        }
        mentionSpan.a(z2);
        MentionSpan[] mentionText = getMentionText();
        if (!z2 && mentionText != null && Arrays.asList(mentionText).contains(mentionSpan)) {
            return false;
        }
        if (TextUtils.isEmpty(text)) {
            if (z2) {
                a(spannableString.length() + 1);
                Boolean.valueOf(false);
                a();
            }
            text.insert(0, spannableString);
            text.append((CharSequence) " ");
            if (z2) {
                Boolean.valueOf(false);
                a(((Object) spannableString) + " ");
            }
            return true;
        }
        int length = text.length();
        if (z2) {
            a(spannableString.length() + 1);
            Boolean.valueOf(false);
            a();
            text.insert(selectionStart, " ");
            text.insert(selectionStart, spannableString);
            Boolean.valueOf(false);
            a(((Object) spannableString) + " ");
        } else if (selectionStart <= length && selectionStart >= 0) {
            q.b("index = " + selectionStart + " length = " + length + " text = " + text.toString());
            if (selectionStart > 0) {
                int i4 = selectionStart - 1;
                if (TextUtils.equals(text.subSequence(i4, selectionStart), str5)) {
                    text.delete(i4, selectionStart);
                    selectionStart--;
                    length--;
                }
            }
            int min = Math.min(length, Math.max(0, selectionStart));
            if (min > text.length()) {
                q.b("index = " + min + " length = " + length + " text = " + text.toString());
            }
            try {
                text.insert(min, spannableString);
                text.insert(Math.min(min + spannableString.length(), text.length()), " ");
            } catch (IndexOutOfBoundsException e2) {
                if (!SettingsManager.a().a("mention_crash_catch", false)) {
                    throw e2;
                }
            }
        }
        return true;
    }

    public final boolean a(String str, String str2, String str3, String str4, String str5, int i2, int i3) {
        if (this.s || str == null || str.isEmpty() || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
            return false;
        }
        int selectionStart = getSelectionStart();
        Editable text = getText();
        if (text == null) {
            return false;
        }
        setAddVideoChain(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("@" + str);
        MentionSpan mentionSpan = new MentionSpan(this.n, spannableStringBuilder.toString(), str3, 5, " ", str4);
        mentionSpan.a(str2);
        mentionSpan.a(6);
        spannableStringBuilder.setSpan(mentionSpan, 0, spannableStringBuilder.length(), 33);
        if (this.f132593b != 0) {
            spannableStringBuilder.setSpan(new StyleSpan(this.f132593b), 0, spannableStringBuilder.length(), 33);
        }
        spannableStringBuilder.setSpan(new com.ss.android.ugc.aweme.shortvideo.aa.a(getContext(), this), 0, spannableStringBuilder.length(), 33);
        mentionSpan.a(false);
        if (TextUtils.isEmpty(text)) {
            text.insert(0, spannableStringBuilder);
            text.append((CharSequence) " ");
            if (this.f132598g) {
                if (i3 == 1) {
                    new com.bytedance.tux.g.b(this).e(R.string.gcu).b();
                } else if (i2 == 143 || i2 == 2) {
                    new com.bytedance.tux.g.b(this).e(R.string.gcq).b();
                } else if (i2 == 144) {
                    new com.bytedance.tux.g.b(this).e(R.string.gck).b();
                }
                this.f132598g = false;
            }
            w.a(this.f132597f, str5, i2, i3);
            return true;
        }
        int length = text.length();
        if (selectionStart <= length && selectionStart >= 0) {
            if (selectionStart > 0) {
                int i4 = selectionStart - 1;
                if (TextUtils.equals(text.subSequence(i4, selectionStart), "@")) {
                    text.delete(i4, selectionStart);
                    selectionStart--;
                    length--;
                }
            }
            int min = Math.min(length, Math.max(0, selectionStart));
            text.insert(min, spannableStringBuilder);
            text.insert(Math.min(min + spannableStringBuilder.length(), text.length()), " ");
            if (this.f132598g) {
                if (i3 == 1) {
                    new com.bytedance.tux.g.b(this).e(R.string.gcu).b();
                } else if (i2 == 143 || i2 == 2) {
                    new com.bytedance.tux.g.b(this).e(R.string.gcq).b();
                } else if (i2 == 144) {
                    new com.bytedance.tux.g.b(this).e(R.string.gck).b();
                }
                this.f132598g = false;
            }
            w.a(this.f132597f, str5, i2, i3);
        }
        return true;
    }
}
