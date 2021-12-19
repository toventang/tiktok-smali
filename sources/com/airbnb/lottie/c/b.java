package com.airbnb.lottie.c;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.util.DisplayMetrics;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.g;
import com.airbnb.lottie.g.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap<Integer, LinkedBlockingQueue<Bitmap>> f5311a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public static final b f5312b = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(2235);
    }

    public static Bitmap a(g gVar) {
        Bitmap poll;
        MethodCollector.i(5348);
        l.c(gVar, "");
        LinkedBlockingQueue<Bitmap> linkedBlockingQueue = f5311a.get(Integer.valueOf(gVar.hashCode()));
        if (linkedBlockingQueue != null) {
            synchronized (linkedBlockingQueue) {
                try {
                    poll = linkedBlockingQueue.poll();
                } finally {
                    MethodCollector.o(5348);
                }
            }
            return poll;
        }
        MethodCollector.o(5348);
        return null;
    }

    public static boolean a(g gVar, DisplayMetrics displayMetrics) {
        MethodCollector.i(5377);
        l.c(gVar, "");
        l.c(displayMetrics, "");
        Bitmap a2 = a.a(gVar, Bitmap.Config.ARGB_8888, displayMetrics);
        int hashCode = gVar.hashCode();
        ConcurrentHashMap<Integer, LinkedBlockingQueue<Bitmap>> concurrentHashMap = f5311a;
        if (concurrentHashMap.get(Integer.valueOf(hashCode)) == null) {
            concurrentHashMap.put(Integer.valueOf(hashCode), new LinkedBlockingQueue<>());
        }
        if (a2 != null) {
            LottieAnimationView n = gVar.n();
            if (n != null) {
                try {
                    Canvas canvas = new Canvas(a2);
                    canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                    if (n.getBackground() != null) {
                        n.getBackground().setBounds(0, 0, a2.getWidth(), a2.getHeight());
                        if ((n.getScrollX() | n.getScrollY()) == 0) {
                            n.getBackground().draw(canvas);
                        } else {
                            canvas.translate((float) n.getScrollX(), (float) n.getScrollY());
                            n.getBackground().draw(canvas);
                            canvas.translate(-((float) n.getScrollX()), -((float) n.getScrollY()));
                        }
                    }
                    if (n.getImageMatrix() == null && n.getPaddingTop() == 0 && n.getPaddingLeft() == 0) {
                        gVar.a(canvas);
                    } else {
                        int saveCount = canvas.getSaveCount();
                        canvas.save();
                        if (n.getCropToPadding()) {
                            canvas.clipRect(n.getScrollX() + n.getPaddingLeft(), n.getScrollY() + n.getPaddingTop(), ((n.getScrollX() + n.getRight()) - n.getLeft()) - n.getPaddingRight(), ((n.getScrollY() + n.getBottom()) - n.getTop()) - n.getPaddingBottom());
                        }
                        canvas.translate((float) n.getPaddingLeft(), (float) n.getPaddingTop());
                        if (n.getImageMatrix() != null) {
                            canvas.concat(n.getImageMatrix());
                        }
                        gVar.a(canvas);
                        canvas.restoreToCount(saveCount);
                    }
                    LinkedBlockingQueue<Bitmap> linkedBlockingQueue = concurrentHashMap.get(Integer.valueOf(hashCode));
                    if (linkedBlockingQueue != null) {
                        synchronized (linkedBlockingQueue) {
                            try {
                                linkedBlockingQueue.add(a2);
                            } catch (Throwable th) {
                                MethodCollector.o(5377);
                                throw th;
                            }
                        }
                    }
                } catch (Exception unused) {
                }
            }
            d.e(gVar);
            MethodCollector.o(5377);
            return true;
        }
        MethodCollector.o(5377);
        return false;
    }
}
