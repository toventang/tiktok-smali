package androidx.core.app;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import androidx.core.app.p;
import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.Map;

public final class a extends androidx.core.content.b {

    /* renamed from: a  reason: collision with root package name */
    public static b f2126a;

    /* renamed from: androidx.core.app.a$a  reason: collision with other inner class name */
    public interface AbstractC0026a {
        static {
            Covode.recordClassIndex(649);
        }

        void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr);
    }

    public interface b {
        static {
            Covode.recordClassIndex(650);
        }

        boolean a();

        boolean b();
    }

    public interface c {
        static {
            Covode.recordClassIndex(651);
        }

        void validateRequestPermissionsRequestCode(int i2);
    }

    static {
        Covode.recordClassIndex(647);
    }

    public static class d extends SharedElementCallback {

        /* renamed from: a  reason: collision with root package name */
        private final p f2130a;

        static {
            Covode.recordClassIndex(652);
        }

        @Override // android.app.SharedElementCallback
        public final void onMapSharedElements(List<String> list, Map<String, View> map) {
        }

        @Override // android.app.SharedElementCallback
        public final void onRejectSharedElements(List<View> list) {
        }

        @Override // android.app.SharedElementCallback
        public final void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
        }

        @Override // android.app.SharedElementCallback
        public final void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
        }

        public d(p pVar) {
            this.f2130a = pVar;
        }

        public final View onCreateSnapshotView(Context context, Parcelable parcelable) {
            if (parcelable instanceof Bundle) {
                Bundle bundle = (Bundle) parcelable;
                Bitmap bitmap = (Bitmap) bundle.getParcelable("sharedElement:snapshot:bitmap");
                if (bitmap == null) {
                    return null;
                }
                ImageView imageView = new ImageView(context);
                imageView.setImageBitmap(bitmap);
                imageView.setScaleType(ImageView.ScaleType.valueOf(bundle.getString("sharedElement:snapshot:imageScaleType")));
                if (imageView.getScaleType() != ImageView.ScaleType.MATRIX) {
                    return imageView;
                }
                float[] floatArray = bundle.getFloatArray("sharedElement:snapshot:imageMatrix");
                Matrix matrix = new Matrix();
                matrix.setValues(floatArray);
                imageView.setImageMatrix(matrix);
                return imageView;
            } else if (!(parcelable instanceof Bitmap)) {
                return null;
            } else {
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageBitmap((Bitmap) parcelable);
                return imageView2;
            }
        }

        @Override // android.app.SharedElementCallback
        public final void onSharedElementsArrived(List<String> list, List<View> list2, final SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            new p.a() {
                /* class androidx.core.app.a.d.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(653);
                }

                @Override // androidx.core.app.p.a
                public final void a() {
                    onSharedElementsReadyListener.onSharedElementsReady();
                }
            }.a();
        }

        public final Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            Bitmap createBitmap;
            p pVar = this.f2130a;
            if (view instanceof ImageView) {
                ImageView imageView = (ImageView) view;
                Drawable drawable = imageView.getDrawable();
                Drawable background = imageView.getBackground();
                if (drawable != null && background == null) {
                    int intrinsicWidth = drawable.getIntrinsicWidth();
                    int intrinsicHeight = drawable.getIntrinsicHeight();
                    if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                        float min = Math.min(1.0f, 1048576.0f / ((float) (intrinsicWidth * intrinsicHeight)));
                        if (!(drawable instanceof BitmapDrawable) || min != 1.0f) {
                            int i2 = (int) (((float) intrinsicWidth) * min);
                            int i3 = (int) (((float) intrinsicHeight) * min);
                            createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(createBitmap);
                            Rect bounds = drawable.getBounds();
                            int i4 = bounds.left;
                            int i5 = bounds.top;
                            int i6 = bounds.right;
                            int i7 = bounds.bottom;
                            drawable.setBounds(0, 0, i2, i3);
                            drawable.draw(canvas);
                            drawable.setBounds(i4, i5, i6, i7);
                        } else {
                            createBitmap = ((BitmapDrawable) drawable).getBitmap();
                        }
                        if (createBitmap != null) {
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("sharedElement:snapshot:bitmap", createBitmap);
                            bundle.putString("sharedElement:snapshot:imageScaleType", imageView.getScaleType().toString());
                            if (imageView.getScaleType() == ImageView.ScaleType.MATRIX) {
                                float[] fArr = new float[9];
                                imageView.getImageMatrix().getValues(fArr);
                                bundle.putFloatArray("sharedElement:snapshot:imageMatrix", fArr);
                            }
                            return bundle;
                        }
                    }
                }
            }
            int round = Math.round(rectF.width());
            int round2 = Math.round(rectF.height());
            if (round <= 0 || round2 <= 0) {
                return null;
            }
            float min2 = Math.min(1.0f, 1048576.0f / ((float) (round * round2)));
            int i8 = (int) (((float) round) * min2);
            int i9 = (int) (((float) round2) * min2);
            if (pVar.f2264a == null) {
                pVar.f2264a = new Matrix();
            }
            pVar.f2264a.set(matrix);
            pVar.f2264a.postTranslate(-rectF.left, -rectF.top);
            pVar.f2264a.postScale(min2, min2);
            Bitmap createBitmap2 = Bitmap.createBitmap(i8, i9, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            canvas2.concat(pVar.f2264a);
            view.draw(canvas2);
            return createBitmap2;
        }
    }

    public static void a(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.finishAfterTransition();
        } else {
            activity.finish();
        }
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.postponeEnterTransition();
        }
    }

    public static void c(Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.startPostponedEnterTransition();
        }
    }

    public static boolean a(Activity activity, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        return false;
    }

    public static void a(final Activity activity, final String[] strArr, final int i2) {
        b bVar = f2126a;
        if (bVar != null && bVar.a()) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (activity instanceof c) {
                ((c) activity).validateRequestPermissionsRequestCode(i2);
            }
            if (!((Boolean) com.bytedance.helios.sdk.a.a(activity, new Object[]{strArr, Integer.valueOf(i2)}, 102600, "void", false, null).first).booleanValue()) {
                com.bytedance.helios.sdk.a.a(null, activity, new Object[]{strArr, Integer.valueOf(i2)}, 102600, "androidx_core_app_ActivityCompat_android_app_Activity_requestPermissions(Landroid/app/Activity;[Ljava/lang/String;I)V");
                activity.requestPermissions(strArr, i2);
            }
        } else if (activity instanceof AbstractC0026a) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                /* class androidx.core.app.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(648);
                }

                public final void run() {
                    int[] iArr = new int[strArr.length];
                    PackageManager packageManager = activity.getPackageManager();
                    String packageName = activity.getPackageName();
                    int length = strArr.length;
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr[i2] = packageManager.checkPermission(strArr[i2], packageName);
                    }
                    ((AbstractC0026a) activity).onRequestPermissionsResult(i2, strArr, iArr);
                }
            });
        }
    }

    public static void a(Activity activity, Intent intent, int i2, Bundle bundle) {
        int i3 = Build.VERSION.SDK_INT;
        activity.startActivityForResult(intent, i2, bundle);
    }

    public static void a(Activity activity, IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) {
        int i6 = Build.VERSION.SDK_INT;
        activity.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
    }
}
