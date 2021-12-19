package androidx.media.a;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.res.Resources;
import android.media.session.MediaSession;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat;
import android.widget.RemoteViews;
import androidx.core.app.h;
import androidx.core.app.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.java.ResourcesProtector;
import com.zhiliaoapp.musically.R;

public final class a {
    static {
        Covode.recordClassIndex(1384);
    }

    /* renamed from: androidx.media.a.a$a  reason: collision with other inner class name */
    public static class C0053a extends i.h {

        /* renamed from: a  reason: collision with root package name */
        public int[] f3634a;

        /* renamed from: b  reason: collision with root package name */
        public MediaSessionCompat.Token f3635b;

        /* renamed from: c  reason: collision with root package name */
        boolean f3636c;

        /* renamed from: h  reason: collision with root package name */
        public PendingIntent f3637h;

        static {
            Covode.recordClassIndex(1385);
        }

        public final C0053a c() {
            if (Build.VERSION.SDK_INT < 21) {
                this.f3636c = true;
            }
            return this;
        }

        @Override // androidx.core.app.i.h
        public final RemoteViews b() {
            int i2;
            if (Build.VERSION.SDK_INT >= 21) {
                return null;
            }
            int min = Math.min(this.f2202d.f2179b.size(), 5);
            if (min <= 3) {
                i2 = R.layout.amj;
            } else {
                i2 = R.layout.amh;
            }
            RemoteViews a2 = a(i2, false);
            a2.removeAllViews(R.id.cl6);
            if (min > 0) {
                int i3 = 0;
                do {
                    a2.addView(R.id.cl6, a(this.f2202d.f2179b.get(i3)));
                    i3++;
                } while (i3 < min);
            }
            if (this.f3636c) {
                a2.setViewVisibility(R.id.a1r, 0);
                a2.setInt(R.id.a1r, "setAlpha", a(this.f2202d.f2178a.getResources()));
                a2.setOnClickPendingIntent(R.id.a1r, this.f3637h);
            } else {
                a2.setViewVisibility(R.id.a1r, 8);
            }
            return a2;
        }

        @Override // androidx.core.app.i.h
        public final RemoteViews a() {
            int min;
            if (Build.VERSION.SDK_INT >= 21) {
                return null;
            }
            RemoteViews a2 = a(R.layout.amo, true);
            int size = this.f2202d.f2179b.size();
            int[] iArr = this.f3634a;
            if (iArr == null) {
                min = 0;
            } else {
                min = Math.min(iArr.length, 3);
            }
            a2.removeAllViews(R.id.cl6);
            if (min > 0) {
                int i2 = 0;
                while (i2 < size) {
                    a2.addView(R.id.cl6, a(this.f2202d.f2179b.get(this.f3634a[i2])));
                    i2++;
                    if (i2 >= min) {
                    }
                }
                throw new IllegalArgumentException(com.a.a("setShowActionsInCompactView: action %d out of bounds (max %d)", new Object[]{Integer.valueOf(i2), Integer.valueOf(size - 1)}));
            }
            if (this.f3636c) {
                a2.setViewVisibility(R.id.awk, 8);
                a2.setViewVisibility(R.id.a1r, 0);
                a2.setOnClickPendingIntent(R.id.a1r, this.f3637h);
                a2.setInt(R.id.a1r, "setAlpha", a(this.f2202d.f2178a.getResources()));
            } else {
                a2.setViewVisibility(R.id.awk, 0);
                a2.setViewVisibility(R.id.a1r, 8);
            }
            return a2;
        }

        public final C0053a a(PendingIntent pendingIntent) {
            this.f3637h = pendingIntent;
            return this;
        }

        public final C0053a a(MediaSessionCompat.Token token) {
            this.f3635b = token;
            return this;
        }

        public final C0053a a(int... iArr) {
            this.f3634a = iArr;
            return this;
        }

        private RemoteViews a(i.a aVar) {
            boolean z;
            if (aVar.f2166j == null) {
                z = true;
            } else {
                z = false;
            }
            RemoteViews remoteViews = new RemoteViews(this.f2202d.f2178a.getPackageName(), (int) R.layout.ame);
            remoteViews.setImageViewResource(R.id.bv, aVar.f2164h);
            if (!z) {
                remoteViews.setOnClickPendingIntent(R.id.bv, aVar.f2166j);
            }
            int i2 = Build.VERSION.SDK_INT;
            remoteViews.setContentDescription(R.id.bv, aVar.f2165i);
            return remoteViews;
        }

        private static int a(Resources resources) {
            ResourcesProtector.Config matchConfig = ResourcesProtector.getMatchConfig(R.integer.am);
            if (matchConfig == null) {
                return resources.getInteger(R.integer.am);
            }
            try {
                if (!matchConfig.mockCrash) {
                    return resources.getInteger(R.integer.am);
                }
                throw new Resources.NotFoundException("unknown resource from mocked");
            } catch (Throwable th) {
                StackTraceElement[] stackTrace = th.getStackTrace();
                int min = Math.min(stackTrace.length, matchConfig.mMaxStep);
                for (int i2 = 0; i2 < min; i2++) {
                    StackTraceElement stackTraceElement = stackTrace[i2];
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
                return resources.getInteger(R.integer.am);
            }
        }

        @Override // androidx.core.app.i.h
        public final void a(h hVar) {
            if (Build.VERSION.SDK_INT >= 21) {
                Notification.Builder a2 = hVar.a();
                Notification.MediaStyle mediaStyle = new Notification.MediaStyle();
                int[] iArr = this.f3634a;
                if (iArr != null) {
                    mediaStyle.setShowActionsInCompactView(iArr);
                }
                MediaSessionCompat.Token token = this.f3635b;
                if (token != null) {
                    mediaStyle.setMediaSession((MediaSession.Token) token.f694a);
                }
                a2.setStyle(mediaStyle);
            } else if (this.f3636c) {
                hVar.a().setOngoing(true);
            }
        }
    }
}
