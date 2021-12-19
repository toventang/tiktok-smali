package androidx.l.a.a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import androidx.core.content.a.h;
import androidx.core.graphics.d;
import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class e {
    static {
        Covode.recordClassIndex(1256);
    }

    private static boolean a(int i2) {
        return i2 >= 28 && i2 <= 31;
    }

    /* access modifiers changed from: package-private */
    public static class a implements TypeEvaluator<d.b[]> {

        /* renamed from: a  reason: collision with root package name */
        private d.b[] f3400a;

        static {
            Covode.recordClassIndex(1257);
        }

        a() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [float, java.lang.Object, java.lang.Object] */
        @Override // android.animation.TypeEvaluator
        public final /* synthetic */ d.b[] evaluate(float f2, d.b[] bVarArr, d.b[] bVarArr2) {
            d.b[] bVarArr3 = bVarArr;
            d.b[] bVarArr4 = bVarArr2;
            if (d.a(bVarArr3, bVarArr4)) {
                d.b[] bVarArr5 = this.f3400a;
                if (bVarArr5 == null || !d.a(bVarArr5, bVarArr3)) {
                    this.f3400a = d.a(bVarArr3);
                }
                for (int i2 = 0; i2 < bVarArr3.length; i2++) {
                    this.f3400a[i2].a(bVarArr3[i2], bVarArr4[i2], f2);
                }
                return this.f3400a;
            }
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: android.animation.PropertyValuesHolder[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0092, code lost:
        if (a(r1.type) != false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01af, code lost:
        if (r1 == null) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01b1, code lost:
        r1 = a(r3, r2, 0, 1, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01b7, code lost:
        if (r1 == null) goto L_0x01a7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01af  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.animation.PropertyValuesHolder[] a(android.content.Context r16, android.content.res.Resources r17, android.content.res.Resources.Theme r18, org.xmlpull.v1.XmlPullParser r19, android.util.AttributeSet r20) {
        /*
        // Method dump skipped, instructions count: 465
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.l.a.a.e.a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet):android.animation.PropertyValuesHolder[]");
    }

    private static void a(Keyframe[] keyframeArr, float f2, int i2, int i3) {
        float f3 = f2 / ((float) ((i3 - i2) + 2));
        while (i2 <= i3) {
            keyframeArr[i2].setFraction(keyframeArr[i2 - 1].getFraction() + f3);
            i2++;
        }
    }

    private static Keyframe a(Keyframe keyframe, float f2) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(f2);
        }
        if (keyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt(f2);
        }
        return Keyframe.ofObject(f2);
    }

    public static Animator a(Context context, Resources resources, Resources.Theme theme, int i2) {
        XmlResourceParser xmlResourceParser = null;
        try {
            XmlResourceParser animation = resources.getAnimation(i2);
            Animator a2 = a(context, resources, theme, animation, Xml.asAttributeSet(animation), null, 0, 1.0f);
            if (animation != null) {
                animation.close();
            }
            return a2;
        } catch (XmlPullParserException e2) {
            Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i2));
            notFoundException.initCause(e2);
            throw notFoundException;
        } catch (IOException e3) {
            Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i2));
            notFoundException2.initCause(e3);
            throw notFoundException2;
        } catch (Throwable th) {
            if (0 != 0) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0138, code lost:
        if (r3 == 0) goto L_0x013a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0079  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.animation.PropertyValuesHolder a(android.content.res.TypedArray r15, int r16, int r17, int r18, java.lang.String r19) {
        /*
        // Method dump skipped, instructions count: 356
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.l.a.a.e.a(android.content.res.TypedArray, int, int, int, java.lang.String):android.animation.PropertyValuesHolder");
    }

    private static void a(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f2, XmlPullParser xmlPullParser) {
        boolean z;
        int i2;
        boolean z2;
        int i3;
        long a2 = (long) h.a(typedArray, xmlPullParser, "duration", 1, 300);
        long a3 = (long) h.a(typedArray, xmlPullParser, "startOffset", 2, 0);
        int a4 = h.a(typedArray, xmlPullParser, "valueType", 7, 4);
        if (h.a(xmlPullParser, "valueFrom") && h.a(xmlPullParser, "valueTo")) {
            if (a4 == 4) {
                TypedValue peekValue = typedArray.peekValue(5);
                if (peekValue != null) {
                    z = true;
                    i2 = peekValue.type;
                } else {
                    z = false;
                    i2 = 0;
                }
                TypedValue peekValue2 = typedArray.peekValue(6);
                if (peekValue2 != null) {
                    z2 = true;
                    i3 = peekValue2.type;
                } else {
                    z2 = false;
                    i3 = 0;
                }
                if ((!z || !a(i2)) && (!z2 || !a(i3))) {
                    a4 = 0;
                } else {
                    a4 = 3;
                }
            }
            PropertyValuesHolder a5 = a(typedArray, a4, 5, 6, "");
            if (a5 != null) {
                valueAnimator.setValues(a5);
            }
        }
        valueAnimator.setDuration(a2);
        valueAnimator.setStartDelay(a3);
        valueAnimator.setRepeatCount(h.a(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(h.a(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
            String c2 = h.c(typedArray2, xmlPullParser, "pathData", 1);
            if (c2 != null) {
                String c3 = h.c(typedArray2, xmlPullParser, "propertyXName", 2);
                String c4 = h.c(typedArray2, xmlPullParser, "propertyYName", 3);
                if (c3 == null && c4 == null) {
                    throw new InflateException(typedArray2.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                a(d.a(c2), objectAnimator, 0.5f * f2, c3, c4);
                return;
            }
            objectAnimator.setPropertyName(h.c(typedArray2, xmlPullParser, "propertyName", 0));
        }
    }

    private static void a(Path path, ObjectAnimator objectAnimator, float f2, String str, String str2) {
        PropertyValuesHolder propertyValuesHolder;
        PropertyValuesHolder propertyValuesHolder2;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        float f3 = 0.0f;
        arrayList.add(Float.valueOf(0.0f));
        float f4 = 0.0f;
        do {
            f4 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f4));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int min = Math.min(100, ((int) (f4 / f2)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        float f5 = f4 / ((float) (min - 1));
        int i2 = 0;
        int i3 = 0;
        while (true) {
            propertyValuesHolder = null;
            if (i2 >= min) {
                break;
            }
            pathMeasure2.getPosTan(f3 - ((Float) arrayList.get(i3)).floatValue(), fArr3, null);
            fArr[i2] = fArr3[0];
            fArr2[i2] = fArr3[1];
            f3 += f5;
            int i4 = i3 + 1;
            if (i4 < arrayList.size() && f3 > ((Float) arrayList.get(i4)).floatValue()) {
                pathMeasure2.nextContour();
                i3 = i4;
            }
            i2++;
        }
        if (str != null) {
            propertyValuesHolder2 = PropertyValuesHolder.ofFloat(str, fArr);
        } else {
            propertyValuesHolder2 = null;
        }
        if (str2 != null) {
            propertyValuesHolder = PropertyValuesHolder.ofFloat(str2, fArr2);
        }
        if (propertyValuesHolder2 == null) {
            objectAnimator.setValues(propertyValuesHolder);
        } else if (propertyValuesHolder == null) {
            objectAnimator.setValues(propertyValuesHolder2);
        } else {
            objectAnimator.setValues(propertyValuesHolder2, propertyValuesHolder);
        }
    }

    private static ObjectAnimator a(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f2, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        a(context, resources, theme, attributeSet, objectAnimator, f2, xmlPullParser);
        return objectAnimator;
    }

    private static ValueAnimator a(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f2, XmlPullParser xmlPullParser) {
        TypedArray a2 = h.a(resources, theme, attributeSet, a.f3383g);
        TypedArray a3 = h.a(resources, theme, attributeSet, a.f3387k);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        a(valueAnimator, a2, a3, f2, xmlPullParser);
        int b2 = h.b(a2, xmlPullParser, "interpolator", 0);
        if (b2 > 0) {
            valueAnimator.setInterpolator(d.a(context, b2));
        }
        a2.recycle();
        if (a3 != null) {
            a3.recycle();
        }
        return valueAnimator;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:44:0x0008 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:49:0x0008 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: android.animation.Animator[] */
    /* JADX DEBUG: Multi-variable search result rejected for r14v3, resolved type: android.animation.AnimatorSet */
    /* JADX WARN: Multi-variable type inference failed */
    private static Animator a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet, AnimatorSet animatorSet, int i2, float f2) {
        int i3;
        int depth = xmlPullParser.getDepth();
        ObjectAnimator objectAnimator = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            i3 = 0;
            if (next != 3) {
                if (next == 1) {
                    break;
                } else if (next == 2) {
                    String name = xmlPullParser.getName();
                    if (name.equals("objectAnimator")) {
                        objectAnimator = a(context, resources, theme, attributeSet, f2, xmlPullParser);
                    } else if (name.equals("animator")) {
                        objectAnimator = a(context, resources, theme, attributeSet, null, f2, xmlPullParser);
                    } else if (name.equals("set")) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        TypedArray a2 = h.a(resources, theme, attributeSet, a.f3384h);
                        a(context, resources, theme, xmlPullParser, attributeSet, animatorSet2, h.a(a2, xmlPullParser, "ordering", 0, 0), f2);
                        a2.recycle();
                        objectAnimator = animatorSet2;
                    } else if (name.equals("propertyValuesHolder")) {
                        PropertyValuesHolder[] a3 = a(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser));
                        if (!(a3 == null || objectAnimator == null || !(objectAnimator instanceof ValueAnimator))) {
                            objectAnimator.setValues(a3);
                        }
                        i3 = 1;
                        objectAnimator = objectAnimator;
                    } else {
                        throw new RuntimeException("Unknown animator name: " + xmlPullParser.getName());
                    }
                    if (animatorSet != null && i3 == 0) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(objectAnimator);
                    }
                } else {
                    continue;
                }
            } else if (xmlPullParser.getDepth() <= depth) {
                break;
            }
        }
        if (!(animatorSet == null || arrayList == null)) {
            Animator[] animatorArr = new Animator[arrayList.size()];
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                animatorArr[i3] = it.next();
                i3++;
            }
            if (i2 == 0) {
                animatorSet.playTogether(animatorArr);
            } else {
                animatorSet.playSequentially(animatorArr);
            }
        }
        return objectAnimator;
    }
}
