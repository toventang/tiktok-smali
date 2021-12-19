package androidx.appcompat.widget;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.java.ResourcesProtector;
import java.io.InputStream;

class ad extends Resources {

    /* renamed from: a  reason: collision with root package name */
    private final Resources f1496a;

    static {
        Covode.recordClassIndex(458);
    }

    public Configuration getConfiguration() {
        return this.f1496a.getConfiguration();
    }

    public DisplayMetrics getDisplayMetrics() {
        return this.f1496a.getDisplayMetrics();
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getAnimation(int i2) {
        return this.f1496a.getAnimation(i2);
    }

    @Override // android.content.res.Resources
    public boolean getBoolean(int i2) {
        return this.f1496a.getBoolean(i2);
    }

    @Override // android.content.res.Resources
    public int getColor(int i2) {
        return this.f1496a.getColor(i2);
    }

    @Override // android.content.res.Resources
    public ColorStateList getColorStateList(int i2) {
        return this.f1496a.getColorStateList(i2);
    }

    @Override // android.content.res.Resources
    public float getDimension(int i2) {
        return this.f1496a.getDimension(i2);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelOffset(int i2) {
        return this.f1496a.getDimensionPixelOffset(i2);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelSize(int i2) {
        return this.f1496a.getDimensionPixelSize(i2);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i2) {
        return this.f1496a.getDrawable(i2);
    }

    @Override // android.content.res.Resources
    public int[] getIntArray(int i2) {
        return this.f1496a.getIntArray(i2);
    }

    @Override // android.content.res.Resources
    public int getInteger(int i2) {
        return a(this.f1496a, i2);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getLayout(int i2) {
        return this.f1496a.getLayout(i2);
    }

    @Override // android.content.res.Resources
    public Movie getMovie(int i2) {
        return this.f1496a.getMovie(i2);
    }

    @Override // android.content.res.Resources
    public String getResourceEntryName(int i2) {
        return this.f1496a.getResourceEntryName(i2);
    }

    @Override // android.content.res.Resources
    public String getResourceName(int i2) {
        return this.f1496a.getResourceName(i2);
    }

    @Override // android.content.res.Resources
    public String getResourcePackageName(int i2) {
        return this.f1496a.getResourcePackageName(i2);
    }

    @Override // android.content.res.Resources
    public String getResourceTypeName(int i2) {
        return this.f1496a.getResourceTypeName(i2);
    }

    @Override // android.content.res.Resources
    public String getString(int i2) {
        return this.f1496a.getString(i2);
    }

    @Override // android.content.res.Resources
    public String[] getStringArray(int i2) {
        return this.f1496a.getStringArray(i2);
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int i2) {
        return this.f1496a.getText(i2);
    }

    @Override // android.content.res.Resources
    public CharSequence[] getTextArray(int i2) {
        return this.f1496a.getTextArray(i2);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getXml(int i2) {
        return this.f1496a.getXml(i2);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainTypedArray(int i2) {
        return this.f1496a.obtainTypedArray(i2);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i2) {
        return this.f1496a.openRawResource(i2);
    }

    @Override // android.content.res.Resources
    public AssetFileDescriptor openRawResourceFd(int i2) {
        return this.f1496a.openRawResourceFd(i2);
    }

    public ad(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f1496a = resources;
    }

    @Override // android.content.res.Resources
    public Drawable getDrawableForDensity(int i2, int i3) {
        return this.f1496a.getDrawableForDensity(i2, i3);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i2, int i3) {
        return this.f1496a.getQuantityString(i2, i3);
    }

    @Override // android.content.res.Resources
    public CharSequence getQuantityText(int i2, int i3) {
        return this.f1496a.getQuantityText(i2, i3);
    }

    public TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return this.f1496a.obtainAttributes(attributeSet, iArr);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) {
        this.f1496a.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i2, Resources.Theme theme) {
        return this.f1496a.getDrawable(i2, theme);
    }

    @Override // android.content.res.Resources
    public String getString(int i2, Object... objArr) {
        return this.f1496a.getString(i2, objArr);
    }

    public CharSequence getText(int i2, CharSequence charSequence) {
        return this.f1496a.getText(i2, charSequence);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i2, TypedValue typedValue) {
        return this.f1496a.openRawResource(i2, typedValue);
    }

    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        Resources resources = this.f1496a;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }

    private static int a(Resources resources, int i2) {
        ResourcesProtector.Config matchConfig = ResourcesProtector.getMatchConfig(i2);
        if (matchConfig == null) {
            return resources.getInteger(i2);
        }
        try {
            if (!matchConfig.mockCrash) {
                return resources.getInteger(i2);
            }
            throw new Resources.NotFoundException("unknown resource from mocked");
        } catch (Throwable th) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            int min = Math.min(stackTrace.length, matchConfig.mMaxStep);
            for (int i3 = 0; i3 < min; i3++) {
                StackTraceElement stackTraceElement = stackTrace[i3];
                if (stackTraceElement != null) {
                    if (matchConfig.mProtectClassName.equals(stackTraceElement.getClassName())) {
                        if (matchConfig.mProtectMethodName.equals(stackTraceElement.getMethodName())) {
                            return matchConfig.mReturnIdWhenException;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return resources.getInteger(i2);
        }
    }

    public float getFraction(int i2, int i3, int i4) {
        return this.f1496a.getFraction(i2, i3, i4);
    }

    public int getIdentifier(String str, String str2, String str3) {
        return this.f1496a.getIdentifier(str, str2, str3);
    }

    @Override // android.content.res.Resources
    public void getValue(int i2, TypedValue typedValue, boolean z) {
        this.f1496a.getValue(i2, typedValue, z);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) {
        this.f1496a.parseBundleExtra(str, attributeSet, bundle);
    }

    public Drawable getDrawableForDensity(int i2, int i3, Resources.Theme theme) {
        return this.f1496a.getDrawableForDensity(i2, i3, theme);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i2, int i3, Object... objArr) {
        return this.f1496a.getQuantityString(i2, i3, objArr);
    }

    @Override // android.content.res.Resources
    public void getValue(String str, TypedValue typedValue, boolean z) {
        this.f1496a.getValue(str, typedValue, z);
    }

    @Override // android.content.res.Resources
    public void getValueForDensity(int i2, int i3, TypedValue typedValue, boolean z) {
        this.f1496a.getValueForDensity(i2, i3, typedValue, z);
    }
}
