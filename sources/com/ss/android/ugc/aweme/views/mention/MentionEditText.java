package com.ss.android.ugc.aweme.views.mention;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableString;
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
import com.bytedance.ies.dmt.ui.widget.DmtEditText;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MentionEditText extends DmtEditText {

    /* renamed from: a  reason: collision with root package name */
    protected int f144635a;

    /* renamed from: b  reason: collision with root package name */
    protected int f144636b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f144637c;

    /* renamed from: d  reason: collision with root package name */
    public b f144638d;

    /* renamed from: e  reason: collision with root package name */
    protected List<b> f144639e;

    /* renamed from: f  reason: collision with root package name */
    public c f144640f;

    /* renamed from: g  reason: collision with root package name */
    protected List<TextWatcher> f144641g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public Set<String> f144642h = new HashSet();

    /* renamed from: i  reason: collision with root package name */
    public View.OnKeyListener f144643i;

    /* renamed from: j  reason: collision with root package name */
    private Runnable f144644j;

    /* renamed from: k  reason: collision with root package name */
    private int f144645k;

    public interface c {
        static {
            Covode.recordClassIndex(94644);
        }
    }

    static {
        Covode.recordClassIndex(94637);
    }

    public String getAdTag() {
        return "";
    }

    /* access modifiers changed from: protected */
    public List<TextExtraStruct> getCompatTextExtraStructList() {
        return getTextExtraStructList();
    }

    public static class MentionSavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<MentionSavedState> CREATOR = new Parcelable.Creator<MentionSavedState>() {
            /* class com.ss.android.ugc.aweme.views.mention.MentionEditText.MentionSavedState.AnonymousClass1 */

            static {
                Covode.recordClassIndex(94639);
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
        public String f144646a;

        /* renamed from: b  reason: collision with root package name */
        public int f144647b;

        /* renamed from: c  reason: collision with root package name */
        public List<TextExtraStruct> f144648c;

        static {
            Covode.recordClassIndex(94638);
        }

        public MentionSavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private MentionSavedState(Parcel parcel) {
            super(parcel);
            this.f144646a = parcel.readString();
            this.f144647b = parcel.readInt();
            Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
            if (readBundle != null) {
                this.f144648c = readBundle.getParcelableArrayList("text_extra_struct");
            }
        }

        /* synthetic */ MentionSavedState(Parcel parcel, byte b2) {
            this(parcel);
        }

        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeString(this.f144646a);
            parcel.writeInt(this.f144647b);
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("text_extra_struct", (ArrayList) this.f144648c);
            parcel.writeBundle(bundle);
        }
    }

    public static class MentionSpan extends ForegroundColorSpan {
        public static final Parcelable.Creator<MentionSpan> CREATOR = new Parcelable.Creator<MentionSpan>() {
            /* class com.ss.android.ugc.aweme.views.mention.MentionEditText.MentionSpan.AnonymousClass1 */

            static {
                Covode.recordClassIndex(94641);
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
        public String f144649a;

        /* renamed from: b  reason: collision with root package name */
        public String f144650b;

        /* renamed from: c  reason: collision with root package name */
        public int f144651c;

        /* renamed from: d  reason: collision with root package name */
        public TextExtraStruct f144652d;

        /* renamed from: e  reason: collision with root package name */
        public String f144653e = "";

        /* renamed from: f  reason: collision with root package name */
        public int f144654f;

        /* renamed from: g  reason: collision with root package name */
        public String f144655g = "";

        public int describeContents() {
            return 0;
        }

        static {
            Covode.recordClassIndex(94640);
        }

        public int hashCode() {
            int i2;
            int i3;
            int i4;
            int i5;
            String str = this.f144649a;
            int i6 = 0;
            if (str != null) {
                i2 = str.hashCode();
            } else {
                i2 = 0;
            }
            int i7 = i2 * 31;
            String str2 = this.f144650b;
            if (str2 != null) {
                i3 = str2.hashCode();
            } else {
                i3 = 0;
            }
            int i8 = (((i7 + i3) * 31) + this.f144651c) * 31;
            TextExtraStruct textExtraStruct = this.f144652d;
            if (textExtraStruct != null) {
                i4 = textExtraStruct.hashCode();
            } else {
                i4 = 0;
            }
            int i9 = (i8 + i4) * 31;
            String str3 = this.f144653e;
            if (str3 != null) {
                i5 = str3.hashCode();
            } else {
                i5 = 0;
            }
            int i10 = (((i9 + i5) * 31) + this.f144654f) * 31;
            String str4 = this.f144655g;
            if (str4 != null) {
                i6 = str4.hashCode();
            }
            return i10 + i6;
        }

        public final void a(int i2) {
            this.f144654f = i2;
            this.f144652d.setSubType(i2);
        }

        public final void a(String str) {
            this.f144653e = str;
            this.f144652d.setAwemeId(str);
        }

        public final void a(boolean z) {
            this.f144652d.setStarAtlasTag(z);
        }

        protected MentionSpan(Parcel parcel) {
            super(parcel);
            this.f144649a = parcel.readString();
            this.f144650b = parcel.readString();
            this.f144651c = parcel.readInt();
            this.f144652d = (TextExtraStruct) parcel.readParcelable(TextExtraStruct.class.getClassLoader());
            this.f144655g = parcel.readString();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                MentionSpan mentionSpan = (MentionSpan) obj;
                if (this.f144651c != mentionSpan.f144651c || this.f144654f != mentionSpan.f144654f) {
                    return false;
                }
                String str = this.f144649a;
                if (str == null ? mentionSpan.f144649a != null : !str.equals(mentionSpan.f144649a)) {
                    return false;
                }
                String str2 = this.f144650b;
                if (str2 == null ? mentionSpan.f144650b != null : !str2.equals(mentionSpan.f144650b)) {
                    return false;
                }
                TextExtraStruct textExtraStruct = this.f144652d;
                if (textExtraStruct == null ? mentionSpan.f144652d != null : !textExtraStruct.equals(mentionSpan.f144652d)) {
                    return false;
                }
                String str3 = this.f144653e;
                if (str3 == null ? mentionSpan.f144653e != null : !str3.equals(mentionSpan.f144653e)) {
                    return false;
                }
                String str4 = this.f144655g;
                String str5 = mentionSpan.f144655g;
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
            parcel.writeString(this.f144649a);
            parcel.writeString(this.f144650b);
            parcel.writeInt(this.f144651c);
            parcel.writeParcelable(this.f144652d, i2);
            parcel.writeString(this.f144655g);
        }

        public MentionSpan(int i2, String str, String str2, int i3, String str3, String str4) {
            super(i2);
            this.f144649a = str2;
            this.f144650b = str;
            this.f144651c = i3;
            this.f144655g = str4;
            TextExtraStruct textExtraStruct = new TextExtraStruct();
            this.f144652d = textExtraStruct;
            textExtraStruct.setUserId(str2);
            this.f144652d.setType(i3);
            this.f144652d.setAtUserType(str3);
            this.f144652d.setSecUid(str4);
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
        private WeakReference<MentionEditText> f144659a;

        static {
            Covode.recordClassIndex(94645);
        }

        public final void run() {
            MentionEditText mentionEditText = this.f144659a.get();
            if (mentionEditText != null) {
                mentionEditText.setSelection(mentionEditText.getText().length());
            }
        }

        public d(MentionEditText mentionEditText) {
            this.f144659a = new WeakReference<>(mentionEditText);
        }
    }

    private void b() {
        this.f144639e = new ArrayList(5);
        this.f144635a = -65536;
        addTextChangedListener(new b(this, (byte) 0));
        if (a(getContext())) {
            int i2 = Build.VERSION.SDK_INT;
            setTextAlignment(5);
            setGravity(getGravity() | 8388611);
        }
    }

    public MentionSpan[] getMentionText() {
        Editable text = getText();
        if (text == null || TextUtils.isEmpty(text.toString())) {
            return null;
        }
        MentionSpan[] mentionSpanArr = (MentionSpan[]) text.getSpans(0, getNoAdTagText().length(), MentionSpan.class);
        Arrays.sort(mentionSpanArr, new a(text));
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
            if (mentionSpan.f144651c == 0) {
                mentionSpan.f144652d.setStart(text.getSpanStart(mentionSpan));
                mentionSpan.f144652d.setEnd(text.getSpanEnd(mentionSpan));
                arrayList.add(mentionSpan.f144652d);
            }
        }
        return arrayList;
    }

    public Parcelable onSaveInstanceState() {
        MentionSavedState mentionSavedState = new MentionSavedState(super.onSaveInstanceState());
        mentionSavedState.f144646a = getNoAdTagText();
        mentionSavedState.f144647b = Math.max(getSelectionEnd(), 0);
        mentionSavedState.f144648c = getCompatTextExtraStructList();
        return mentionSavedState;
    }

    public ArrayList<TextExtraStruct> getStarAtlasExtraList() {
        Editable text = getText();
        if (text == null || TextUtils.isEmpty(text.toString())) {
            return null;
        }
        ArrayList<TextExtraStruct> arrayList = new ArrayList<>();
        MentionSpan[] mentionText = getMentionText();
        for (MentionSpan mentionSpan : mentionText) {
            if (mentionSpan.f144652d.isStarAtlasTag()) {
                mentionSpan.f144652d.setStart(text.getSpanStart(mentionSpan));
                mentionSpan.f144652d.setEnd(text.getSpanEnd(mentionSpan));
                arrayList.add(mentionSpan.f144652d);
            }
        }
        return arrayList;
    }

    public final void a() {
        int i2;
        Editable text = getText();
        if (!(text == null || TextUtils.isEmpty(text.toString()))) {
            int length = text.length();
            MentionSpan[] mentionText = getMentionText();
            for (MentionSpan mentionSpan : mentionText) {
                TextExtraStruct textExtraStruct = mentionSpan.f144652d;
                if (textExtraStruct.getStart() <= length && textExtraStruct.getEnd() <= length && textExtraStruct.getStart() <= textExtraStruct.getEnd() && textExtraStruct.getType() == 0) {
                    text.removeSpan(mentionSpan);
                    if (textExtraStruct.isStarAtlasTag()) {
                        i2 = this.f144636b;
                    } else {
                        i2 = this.f144635a;
                    }
                    MentionSpan mentionSpan2 = new MentionSpan(i2, text.subSequence(textExtraStruct.getStart(), textExtraStruct.getEnd()).toString(), textExtraStruct.getUserId(), textExtraStruct.getType(), textExtraStruct.getAtUserType(), textExtraStruct.getSecUid());
                    mentionSpan2.a(textExtraStruct.isStarAtlasTag());
                    if (!TextUtils.isEmpty(textExtraStruct.getAwemeId())) {
                        mentionSpan2.a(textExtraStruct.getAwemeId());
                    }
                    mentionSpan2.a(textExtraStruct.getSubtype());
                    text.setSpan(mentionSpan2, textExtraStruct.getStart(), textExtraStruct.getEnd(), 33);
                }
            }
        }
    }

    public void setMentionTextColor(int i2) {
        this.f144635a = i2;
    }

    public void setMentionTextTypeface(int i2) {
        this.f144645k = i2;
    }

    public void setOnMentionInputListener(c cVar) {
        this.f144640f = cVar;
    }

    public void setStarAtlasMentionTextColor(int i2) {
        this.f144636b = i2;
    }

    /* access modifiers changed from: package-private */
    public class b implements TextWatcher {
        static {
            Covode.recordClassIndex(94643);
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
            if (i4 == 1 && !TextUtils.isEmpty(charSequence)) {
                charSequence.toString().charAt(i2);
            }
        }
    }

    public void setOnKeyListener(View.OnKeyListener onKeyListener) {
        this.f144643i = onKeyListener;
        super.setOnKeyListener(onKeyListener);
    }

    public void addTextChangedListener(TextWatcher textWatcher) {
        super.addTextChangedListener(textWatcher);
        List<TextWatcher> list = this.f144641g;
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
        List<TextWatcher> list = this.f144641g;
        if (list != null && textWatcher != null) {
            list.remove(textWatcher);
        }
    }

    public MentionEditText(Context context) {
        super(context);
        b();
    }

    private static boolean a(Context context) {
        if (context != null) {
            int i2 = Build.VERSION.SDK_INT;
            if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
                return true;
            }
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof MentionSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        MentionSavedState mentionSavedState = (MentionSavedState) parcelable;
        super.onRestoreInstanceState(mentionSavedState.getSuperState());
        setText(mentionSavedState.f144646a);
        int min = Math.min(mentionSavedState.f144647b, getText().length());
        if (min >= 0) {
            setSelection(min);
        }
        setTextExtraList(mentionSavedState.f144648c);
    }

    class a extends InputConnectionWrapper {

        /* renamed from: b  reason: collision with root package name */
        private EditText f144657b;

        static {
            Covode.recordClassIndex(94642);
        }

        public final boolean sendKeyEvent(KeyEvent keyEvent) {
            if (MentionEditText.this.f144643i != null) {
                return MentionEditText.this.f144643i.onKey(MentionEditText.this, keyEvent.getKeyCode(), keyEvent);
            }
            if (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 67) {
                return super.sendKeyEvent(keyEvent);
            }
            int selectionStart = this.f144657b.getSelectionStart();
            b a2 = MentionEditText.this.a(selectionStart, this.f144657b.getSelectionEnd());
            if (a2 == null) {
                MentionEditText.this.f144637c = false;
                return super.sendKeyEvent(keyEvent);
            } else if (MentionEditText.this.f144637c || selectionStart == a2.f144661a) {
                MentionEditText.this.f144637c = false;
                return super.sendKeyEvent(keyEvent);
            } else {
                MentionEditText.this.f144637c = true;
                MentionEditText.this.f144638d = a2;
                if (Build.VERSION.SDK_INT >= 25) {
                    setSelection(a2.f144661a, a2.f144662b);
                } else {
                    setSelection(a2.f144662b, a2.f144661a);
                }
                return true;
            }
        }

        public final boolean commitText(CharSequence charSequence, int i2) {
            try {
                return super.commitText(charSequence, i2);
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
                            if (!(characterStyle instanceof MentionSpan) || ((MentionSpan) characterStyle).f144651c != 1) {
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
                        b a2 = MentionEditText.this.a(i8, i9);
                        if (a2 == null || (mentionSpanArr = (MentionSpan[]) text.getSpans(a2.f144661a, a2.f144662b, MentionSpan.class)) == null || mentionSpanArr.length <= 0) {
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
            this.f144657b = mentionEditText;
        }
    }

    public void setTextExtraList(List<TextExtraStruct> list) {
        Editable text;
        int i2;
        this.f144637c = false;
        List<b> list2 = this.f144639e;
        if (list2 != null) {
            list2.clear();
        }
        if (!(list == null || list.isEmpty() || (text = getText()) == null || TextUtils.isEmpty(text.toString()))) {
            int length = text.length();
            for (TextExtraStruct textExtraStruct : list) {
                if (textExtraStruct.isStarAtlasTag()) {
                    i2 = this.f144636b;
                } else {
                    i2 = this.f144635a;
                }
                if (textExtraStruct.getType() == 0 && textExtraStruct.getStart() <= length && textExtraStruct.getEnd() <= length && textExtraStruct.getStart() <= textExtraStruct.getEnd()) {
                    MentionSpan mentionSpan = new MentionSpan(i2, text.subSequence(textExtraStruct.getStart(), textExtraStruct.getEnd()).toString(), textExtraStruct.getUserId(), textExtraStruct.getType(), textExtraStruct.getAtUserType(), textExtraStruct.getSecUid());
                    mentionSpan.a(textExtraStruct.isStarAtlasTag());
                    if (!TextUtils.isEmpty(textExtraStruct.getAwemeId())) {
                        mentionSpan.a(textExtraStruct.getAwemeId());
                    }
                    mentionSpan.a(textExtraStruct.getSubtype());
                    text.setSpan(mentionSpan, textExtraStruct.getStart(), textExtraStruct.getEnd(), 33);
                    this.f144639e.add(new b(textExtraStruct.getStart(), textExtraStruct.getEnd()));
                }
            }
        }
    }

    @Override // android.widget.TextView, android.widget.EditText
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        try {
            super.setText(charSequence, bufferType);
        } catch (Exception unused) {
        }
        if (this.f144644j == null) {
            this.f144644j = new d(this);
        }
        if (getText().length() > 0) {
            post(this.f144644j);
        }
    }

    public MentionEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public final b a(int i2, int i3) {
        List<b> list = this.f144639e;
        if (list == null) {
            return null;
        }
        for (b bVar : list) {
            if (bVar.a(i2, i3)) {
                return bVar;
            }
        }
        return null;
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
        b bVar = this.f144638d;
        if (bVar != null) {
            if (bVar.f144661a != i2 || bVar.f144662b != i3) {
                if (bVar.f144661a == i3 && bVar.f144662b == i2) {
                    return;
                }
            } else {
                return;
            }
        }
        b a2 = a(i2, i3);
        if (a2 != null && a2.f144662b == i3) {
            this.f144637c = false;
        }
        List<b> list = this.f144639e;
        if (list != null) {
            for (b bVar2 : list) {
                if ((i2 > bVar2.f144661a && i2 < bVar2.f144662b) || (i3 > bVar2.f144661a && i3 < bVar2.f144662b)) {
                    if (i2 == i3) {
                        try {
                            if ((i2 - bVar2.f144661a) - (bVar2.f144662b - i2) >= 0) {
                                i4 = bVar2.f144662b;
                            } else {
                                i4 = bVar2.f144661a;
                            }
                            setSelection(i4);
                            return;
                        } catch (IndexOutOfBoundsException e2) {
                            e2.printStackTrace();
                            return;
                        }
                    } else {
                        if (i3 < bVar2.f144662b) {
                            setSelection(i2, bVar2.f144662b);
                        }
                        if (i2 > bVar2.f144661a) {
                            setSelection(bVar2.f144661a, i3);
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    public final boolean a(String str, String str2, String str3) {
        return a(str, str2, "", str3);
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        this.f144637c = false;
        List<b> list = this.f144639e;
        if (list != null) {
            list.clear();
        }
        Editable text = getText();
        if (!(text == null || TextUtils.isEmpty(text.toString()))) {
            MentionSpan[] mentionText = getMentionText();
            for (MentionSpan mentionSpan : mentionText) {
                b bVar = new b(text.getSpanStart(mentionSpan), text.getSpanEnd(mentionSpan));
                if (!TextUtils.equals(text.subSequence(bVar.f144661a, bVar.f144662b).toString(), mentionSpan.f144650b)) {
                    text.removeSpan(mentionSpan);
                } else if (mentionSpan.f144651c == 0) {
                    this.f144639e.add(bVar);
                }
            }
        }
    }

    private boolean a(String str, String str2, String str3, String str4) {
        int selectionStart = getSelectionStart();
        Editable text = getText();
        if (text == null) {
            return false;
        }
        SpannableString spannableString = new SpannableString("@" + str);
        MentionSpan mentionSpan = new MentionSpan(this.f144635a, spannableString.toString(), str2, 0, str3, str4);
        spannableString.setSpan(mentionSpan, 0, spannableString.length(), 33);
        if (this.f144645k != 0) {
            spannableString.setSpan(new StyleSpan(this.f144645k), 0, spannableString.length(), 33);
        }
        mentionSpan.a(false);
        MentionSpan[] mentionText = getMentionText();
        if (mentionText != null && Arrays.asList(mentionText).contains(mentionSpan)) {
            return false;
        }
        if (TextUtils.isEmpty(text)) {
            text.insert(0, spannableString);
            text.append((CharSequence) " ");
            return true;
        }
        int length = text.length();
        if (selectionStart <= length && selectionStart >= 0) {
            if (selectionStart > 0) {
                int i2 = selectionStart - 1;
                if (TextUtils.equals(text.subSequence(i2, selectionStart), "@")) {
                    text.delete(i2, selectionStart);
                    selectionStart--;
                    length--;
                }
            }
            int min = Math.min(length, Math.max(0, selectionStart));
            text.insert(min, spannableString);
            text.insert(Math.min(min + spannableString.length(), text.length()), " ");
        }
        return true;
    }
}
