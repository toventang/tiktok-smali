package androidx.appcompat.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.ai;
import androidx.appcompat.widget.d;
import androidx.appcompat.widget.f;
import androidx.appcompat.widget.k;
import androidx.appcompat.widget.n;
import androidx.appcompat.widget.o;
import androidx.appcompat.widget.p;
import androidx.appcompat.widget.r;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

public class AppCompatViewInflater {
    private static final String[] sClassPrefixList = {"android.widget.", "android.view.", "android.webkit."};
    private static final Map<String, Constructor<? extends View>> sConstructorMap = new androidx.c.a();
    private static final Class<?>[] sConstructorSignature = {Context.class, AttributeSet.class};
    private static final int[] sOnClickAttrs = {16843375};
    private final Object[] mConstructorArgs = new Object[2];

    public static int androidx_appcompat_app_AppCompatViewInflater_com_ss_android_ugc_aweme_lancet_LogLancet_i(String str, String str2) {
        return 0;
    }

    /* access modifiers changed from: protected */
    public View createView(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    static {
        Covode.recordClassIndex(242);
    }

    /* access modifiers changed from: package-private */
    public static class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        private final View f891a;

        /* renamed from: b  reason: collision with root package name */
        private final String f892b;

        /* renamed from: c  reason: collision with root package name */
        private Method f893c;

        /* renamed from: d  reason: collision with root package name */
        private Context f894d;

        static {
            Covode.recordClassIndex(243);
        }

        public final void onClick(View view) {
            Method method;
            if (this.f893c == null) {
                for (Context context = this.f891a.getContext(); context != null; context = ((ContextWrapper) context).getBaseContext()) {
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(this.f892b, View.class)) != null) {
                            this.f893c = method;
                            this.f894d = context;
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    }
                }
                int id = this.f891a.getId();
                throw new IllegalStateException("Could not find method " + this.f892b + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f891a.getClass() + (id == -1 ? "" : " with id '" + this.f891a.getContext().getResources().getResourceEntryName(id) + "'"));
            }
            try {
                this.f893c.invoke(this.f894d, view);
            } catch (IllegalAccessException e2) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e2);
            } catch (InvocationTargetException e3) {
                throw new IllegalStateException("Could not execute method for android:onClick", e3);
            }
        }

        public a(View view, String str) {
            this.f891a = view;
            this.f892b = str;
        }
    }

    /* access modifiers changed from: protected */
    public d createAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new d(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public AppCompatButton createButton(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public AppCompatCheckBox createCheckBox(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public f createCheckedTextView(Context context, AttributeSet attributeSet) {
        return new f(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public AppCompatEditText createEditText(Context context, AttributeSet attributeSet) {
        return new AppCompatEditText(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public AppCompatImageButton createImageButton(Context context, AttributeSet attributeSet) {
        return new AppCompatImageButton(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public AppCompatImageView createImageView(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public k createMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new k(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public n createRadioButton(Context context, AttributeSet attributeSet) {
        return new n(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public o createRatingBar(Context context, AttributeSet attributeSet) {
        return new o(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public p createSeekBar(Context context, AttributeSet attributeSet) {
        return new p(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public r createSpinner(Context context, AttributeSet attributeSet) {
        return new r(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public AppCompatTextView createTextView(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    private void checkOnClickListener(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (context instanceof ContextWrapper) {
            int i2 = Build.VERSION.SDK_INT;
            int i3 = Build.VERSION.SDK_INT;
            if (view.hasOnClickListeners()) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sOnClickAttrs);
                String string = obtainStyledAttributes.getString(0);
                if (string != null) {
                    view.setOnClickListener(new a(view, string));
                }
                obtainStyledAttributes.recycle();
            }
        }
    }

    private void verifyNotNull(View view, String str) {
        if (view == null) {
            throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
        }
    }

    private View createViewByPrefix(Context context, String str, String str2) {
        String str3;
        Map<String, Constructor<? extends View>> map = sConstructorMap;
        Constructor<? extends View> constructor = map.get(str);
        if (constructor == null) {
            try {
                ClassLoader classLoader = context.getClassLoader();
                if (str2 != null) {
                    str3 = str2 + str;
                } else {
                    str3 = str;
                }
                constructor = classLoader.loadClass(str3).asSubclass(View.class).getConstructor(sConstructorSignature);
                map.put(str, constructor);
            } catch (Exception unused) {
                return null;
            }
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.mConstructorArgs);
    }

    private View createViewFromTag(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.mConstructorArgs;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 == str.indexOf(46)) {
                int i2 = 0;
                while (true) {
                    String[] strArr = sClassPrefixList;
                    if (i2 < strArr.length) {
                        View createViewByPrefix = createViewByPrefix(context, str, strArr[i2]);
                        if (createViewByPrefix != null) {
                            return createViewByPrefix;
                        }
                        i2++;
                    } else {
                        Object[] objArr2 = this.mConstructorArgs;
                        objArr2[0] = null;
                        objArr2[1] = null;
                        return null;
                    }
                }
            } else {
                View createViewByPrefix2 = createViewByPrefix(context, str, null);
                Object[] objArr3 = this.mConstructorArgs;
                objArr3[0] = null;
                objArr3[1] = null;
                return createViewByPrefix2;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr4 = this.mConstructorArgs;
            objArr4[0] = null;
            objArr4[1] = null;
        }
    }

    private static Context themifyContext(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        int i2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842752, 16842970, R.attr.a6r, R.attr.a6s, R.attr.aik}, 0, 0);
        if (z) {
            i2 = obtainStyledAttributes.getResourceId(0, 0);
        } else {
            i2 = 0;
        }
        if (z2 && i2 == 0 && (i2 = obtainStyledAttributes.getResourceId(4, 0)) != 0) {
            androidx_appcompat_app_AppCompatViewInflater_com_ss_android_ugc_aweme_lancet_LogLancet_i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        if (i2 == 0) {
            return context;
        }
        if (!(context instanceof androidx.appcompat.view.d) || ((androidx.appcompat.view.d) context).f1066a != i2) {
            return new androidx.appcompat.view.d(context, i2);
        }
        return context;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: package-private */
    public final View createView(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        Context context2;
        View createRatingBar;
        if (!z || view == null) {
            context2 = context;
        } else {
            context2 = view.getContext();
        }
        if (z2 || z3) {
            context2 = themifyContext(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = ai.a(context2);
        }
        str.hashCode();
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    createRatingBar = createRatingBar(context2, attributeSet);
                    verifyNotNull(createRatingBar, str);
                    break;
                }
                createRatingBar = createView(context2, str, attributeSet);
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    createRatingBar = createCheckedTextView(context2, attributeSet);
                    verifyNotNull(createRatingBar, str);
                    break;
                }
                createRatingBar = createView(context2, str, attributeSet);
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    createRatingBar = createMultiAutoCompleteTextView(context2, attributeSet);
                    verifyNotNull(createRatingBar, str);
                    break;
                }
                createRatingBar = createView(context2, str, attributeSet);
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    createRatingBar = createTextView(context2, attributeSet);
                    verifyNotNull(createRatingBar, str);
                    break;
                }
                createRatingBar = createView(context2, str, attributeSet);
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    createRatingBar = createImageButton(context2, attributeSet);
                    verifyNotNull(createRatingBar, str);
                    break;
                }
                createRatingBar = createView(context2, str, attributeSet);
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    createRatingBar = createSeekBar(context2, attributeSet);
                    verifyNotNull(createRatingBar, str);
                    break;
                }
                createRatingBar = createView(context2, str, attributeSet);
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    createRatingBar = createSpinner(context2, attributeSet);
                    verifyNotNull(createRatingBar, str);
                    break;
                }
                createRatingBar = createView(context2, str, attributeSet);
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    createRatingBar = createRadioButton(context2, attributeSet);
                    verifyNotNull(createRatingBar, str);
                    break;
                }
                createRatingBar = createView(context2, str, attributeSet);
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    createRatingBar = createImageView(context2, attributeSet);
                    verifyNotNull(createRatingBar, str);
                    break;
                }
                createRatingBar = createView(context2, str, attributeSet);
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    createRatingBar = createAutoCompleteTextView(context2, attributeSet);
                    verifyNotNull(createRatingBar, str);
                    break;
                }
                createRatingBar = createView(context2, str, attributeSet);
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    createRatingBar = createCheckBox(context2, attributeSet);
                    verifyNotNull(createRatingBar, str);
                    break;
                }
                createRatingBar = createView(context2, str, attributeSet);
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    createRatingBar = createEditText(context2, attributeSet);
                    verifyNotNull(createRatingBar, str);
                    break;
                }
                createRatingBar = createView(context2, str, attributeSet);
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    createRatingBar = createButton(context2, attributeSet);
                    verifyNotNull(createRatingBar, str);
                    break;
                }
                createRatingBar = createView(context2, str, attributeSet);
                break;
            default:
                createRatingBar = createView(context2, str, attributeSet);
                break;
        }
        if (!(createRatingBar == null && (context == context2 || (createRatingBar = createViewFromTag(context2, str, attributeSet)) == null))) {
            checkOnClickListener(createRatingBar, attributeSet);
        }
        return createRatingBar;
    }
}
