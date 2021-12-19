package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.app.i;
import androidx.core.graphics.drawable.IconCompat;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class j implements h {

    /* renamed from: a  reason: collision with root package name */
    final Notification.Builder f2206a;

    /* renamed from: b  reason: collision with root package name */
    final i.e f2207b;

    /* renamed from: c  reason: collision with root package name */
    RemoteViews f2208c;

    /* renamed from: d  reason: collision with root package name */
    RemoteViews f2209d;

    /* renamed from: e  reason: collision with root package name */
    final List<Bundle> f2210e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    final Bundle f2211f = new Bundle();

    /* renamed from: g  reason: collision with root package name */
    int f2212g;

    /* renamed from: h  reason: collision with root package name */
    RemoteViews f2213h;

    static {
        Covode.recordClassIndex(683);
    }

    @Override // androidx.core.app.h
    public final Notification.Builder a() {
        return this.f2206a;
    }

    static void a(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -2;
        notification.defaults &= -3;
    }

    private void a(i.a aVar) {
        Notification.Action.Builder builder;
        int i2;
        Bundle bundle;
        Icon icon;
        int i3 = 0;
        if (Build.VERSION.SDK_INT >= 20) {
            IconCompat a2 = aVar.a();
            if (Build.VERSION.SDK_INT >= 23) {
                if (a2 != null) {
                    icon = a2.b();
                } else {
                    icon = null;
                }
                builder = new Notification.Action.Builder(icon, aVar.f2165i, aVar.f2166j);
            } else {
                if (a2 != null) {
                    i2 = a2.a();
                } else {
                    i2 = 0;
                }
                builder = new Notification.Action.Builder(i2, aVar.f2165i, aVar.f2166j);
            }
            if (aVar.f2158b != null) {
                RemoteInput[] a3 = n.a(aVar.f2158b);
                int length = a3.length;
                while (i3 < length) {
                    builder.addRemoteInput(a3[i3]);
                    i3++;
                }
            }
            if (aVar.f2157a != null) {
                bundle = new Bundle(aVar.f2157a);
            } else {
                bundle = new Bundle();
            }
            bundle.putBoolean("android.support.allowGeneratedReplies", aVar.f2160d);
            if (Build.VERSION.SDK_INT >= 24) {
                builder.setAllowGeneratedReplies(aVar.f2160d);
            }
            bundle.putInt("android.support.action.semanticAction", aVar.f2162f);
            if (Build.VERSION.SDK_INT >= 28) {
                builder.setSemanticAction(aVar.f2162f);
            }
            if (Build.VERSION.SDK_INT >= 29) {
                builder.setContextual(aVar.f2163g);
            }
            bundle.putBoolean("android.support.action.showsUserInterface", aVar.f2161e);
            builder.addExtras(bundle);
            this.f2206a.addAction(builder.build());
            return;
        }
        int i4 = Build.VERSION.SDK_INT;
        List<Bundle> list = this.f2210e;
        Notification.Builder builder2 = this.f2206a;
        IconCompat a4 = aVar.a();
        if (a4 != null) {
            i3 = a4.a();
        }
        builder2.addAction(i3, aVar.f2165i, aVar.f2166j);
        Bundle bundle2 = new Bundle(aVar.f2157a);
        if (aVar.f2158b != null) {
            bundle2.putParcelableArray("android.support.remoteInputs", k.a(aVar.f2158b));
        }
        if (aVar.f2159c != null) {
            bundle2.putParcelableArray("android.support.dataRemoteInputs", k.a(aVar.f2159c));
        }
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.f2160d);
        list.add(bundle2);
    }

    j(i.e eVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Notification.BubbleMetadata build;
        int i2;
        Bundle bundle;
        this.f2207b = eVar;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f2206a = new Notification.Builder(eVar.f2178a, eVar.J);
        } else {
            this.f2206a = new Notification.Builder(eVar.f2178a);
        }
        Notification notification = eVar.Q;
        Notification.Builder lights = this.f2206a.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.f2185h).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        boolean z6 = false;
        if ((notification.flags & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        Notification.Builder ongoing = lights.setOngoing(z);
        if ((notification.flags & 8) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Notification.Builder onlyAlertOnce = ongoing.setOnlyAlertOnce(z2);
        if ((notification.flags & 16) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        Notification.Builder deleteIntent = onlyAlertOnce.setAutoCancel(z3).setDefaults(notification.defaults).setContentTitle(eVar.f2181d).setContentText(eVar.f2182e).setContentInfo(eVar.f2187j).setContentIntent(eVar.f2183f).setDeleteIntent(notification.deleteIntent);
        PendingIntent pendingIntent = eVar.f2184g;
        if ((notification.flags & 128) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        deleteIntent.setFullScreenIntent(pendingIntent, z4).setLargeIcon(eVar.f2186i).setNumber(eVar.f2188k).setProgress(eVar.s, eVar.t, eVar.u);
        if (Build.VERSION.SDK_INT < 21) {
            this.f2206a.setSound(notification.sound, notification.audioStreamType);
        }
        int i3 = Build.VERSION.SDK_INT;
        this.f2206a.setSubText(eVar.q).setUsesChronometer(eVar.n).setPriority(eVar.f2189l);
        Iterator<i.a> it = eVar.f2179b.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        if (eVar.C != null) {
            this.f2211f.putAll(eVar.C);
        }
        if (Build.VERSION.SDK_INT < 20) {
            if (eVar.y) {
                this.f2211f.putBoolean("android.support.localOnly", true);
            }
            if (eVar.v != null) {
                this.f2211f.putString("android.support.groupKey", eVar.v);
                if (eVar.w) {
                    this.f2211f.putBoolean("android.support.isGroupSummary", true);
                } else {
                    this.f2211f.putBoolean("android.support.useSideChannel", true);
                }
            }
            if (eVar.x != null) {
                this.f2211f.putString("android.support.sortKey", eVar.x);
            }
        }
        this.f2208c = eVar.G;
        this.f2209d = eVar.H;
        int i4 = Build.VERSION.SDK_INT;
        this.f2206a.setShowWhen(eVar.f2190m);
        if (Build.VERSION.SDK_INT < 21 && eVar.S != null && !eVar.S.isEmpty()) {
            this.f2211f.putStringArray("android.people", (String[]) eVar.S.toArray(new String[eVar.S.size()]));
        }
        if (Build.VERSION.SDK_INT >= 20) {
            this.f2206a.setLocalOnly(eVar.y).setGroup(eVar.v).setGroupSummary(eVar.w).setSortKey(eVar.x);
            this.f2212g = eVar.N;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.f2206a.setCategory(eVar.B).setColor(eVar.D).setVisibility(eVar.E).setPublicVersion(eVar.F).setSound(notification.sound, notification.audioAttributes);
            Iterator<String> it2 = eVar.S.iterator();
            while (it2.hasNext()) {
                this.f2206a.addPerson(it2.next());
            }
            this.f2213h = eVar.I;
            if (eVar.f2180c.size() > 0) {
                Bundle bundle2 = eVar.b().getBundle("android.car.EXTENSIONS");
                bundle2 = bundle2 == null ? new Bundle() : bundle2;
                Bundle bundle3 = new Bundle();
                for (int i5 = 0; i5 < eVar.f2180c.size(); i5++) {
                    String num = Integer.toString(i5);
                    i.a aVar = eVar.f2180c.get(i5);
                    Bundle bundle4 = new Bundle();
                    IconCompat a2 = aVar.a();
                    if (a2 != null) {
                        i2 = a2.a();
                    } else {
                        i2 = 0;
                    }
                    bundle4.putInt("icon", i2);
                    bundle4.putCharSequence("title", aVar.f2165i);
                    bundle4.putParcelable("actionIntent", aVar.f2166j);
                    if (aVar.f2157a != null) {
                        bundle = new Bundle(aVar.f2157a);
                    } else {
                        bundle = new Bundle();
                    }
                    bundle.putBoolean("android.support.allowGeneratedReplies", aVar.f2160d);
                    bundle4.putBundle("extras", bundle);
                    bundle4.putParcelableArray("remoteInputs", k.a(aVar.f2158b));
                    bundle4.putBoolean("showsUserInterface", aVar.f2161e);
                    bundle4.putInt("semanticAction", aVar.f2162f);
                    bundle3.putBundle(num, bundle4);
                }
                bundle2.putBundle("invisible_actions", bundle3);
                eVar.b().putBundle("android.car.EXTENSIONS", bundle2);
                this.f2211f.putBundle("android.car.EXTENSIONS", bundle2);
            }
        }
        if (Build.VERSION.SDK_INT >= 24) {
            this.f2206a.setExtras(eVar.C).setRemoteInputHistory(eVar.r);
            if (eVar.G != null) {
                this.f2206a.setCustomContentView(eVar.G);
            }
            if (eVar.H != null) {
                this.f2206a.setCustomBigContentView(eVar.H);
            }
            if (eVar.I != null) {
                this.f2206a.setCustomHeadsUpContentView(eVar.I);
            }
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.f2206a.setBadgeIconType(eVar.K).setShortcutId(eVar.L).setTimeoutAfter(eVar.M).setGroupAlertBehavior(eVar.N);
            if (eVar.A) {
                this.f2206a.setColorized(eVar.z);
            }
            if (!TextUtils.isEmpty(eVar.J)) {
                this.f2206a.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f2206a.setAllowSystemGeneratedContextualActions(eVar.O);
            Notification.Builder builder = this.f2206a;
            i.d dVar = eVar.P;
            if (dVar == null) {
                build = null;
            } else {
                Notification.BubbleMetadata.Builder builder2 = new Notification.BubbleMetadata.Builder();
                if ((dVar.f2177f & 1) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                Notification.BubbleMetadata.Builder suppressNotification = builder2.setAutoExpandBubble(z5).setDeleteIntent(dVar.f2173b).setIcon(dVar.f2174c.b()).setIntent(dVar.f2172a).setSuppressNotification((dVar.f2177f & 2) != 0 ? true : z6);
                if (dVar.f2175d != 0) {
                    suppressNotification.setDesiredHeight(dVar.f2175d);
                }
                if (dVar.f2176e != 0) {
                    suppressNotification.setDesiredHeightResId(dVar.f2176e);
                }
                build = suppressNotification.build();
            }
            builder.setBubbleMetadata(build);
        }
        if (eVar.R) {
            if (this.f2207b.w) {
                this.f2212g = 2;
            } else {
                this.f2212g = 1;
            }
            this.f2206a.setVibrate(null);
            this.f2206a.setSound(null);
            notification.defaults &= -2;
            notification.defaults &= -3;
            this.f2206a.setDefaults(notification.defaults);
            if (Build.VERSION.SDK_INT >= 26) {
                if (TextUtils.isEmpty(this.f2207b.v)) {
                    this.f2206a.setGroup("silent");
                }
                this.f2206a.setGroupAlertBehavior(this.f2212g);
            }
        }
    }
}
