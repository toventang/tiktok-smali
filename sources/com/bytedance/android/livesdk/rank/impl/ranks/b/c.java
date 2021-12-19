package com.bytedance.android.livesdk.rank.impl.ranks.b;

import androidx.recyclerview.widget.j;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.rank.impl.api.model.Rank;
import com.bytedance.android.livesdk.rank.impl.ranks.b.a;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.List;
import java.util.Objects;

public final class c extends j.a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f20903a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final List<a.e<?>> f20904b;

    /* renamed from: c  reason: collision with root package name */
    private final List<a.e<?>> f20905c;

    static {
        Covode.recordClassIndex(12377);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(12378);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.j.a
    public final int a() {
        return this.f20904b.size();
    }

    @Override // androidx.recyclerview.widget.j.a
    public final int b() {
        return this.f20905c.size();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.bytedance.android.livesdk.rank.impl.ranks.b.a$e<?>> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.bytedance.android.livesdk.rank.impl.ranks.b.a$e<?>> */
    /* JADX WARN: Multi-variable type inference failed */
    public c(List<? extends a.e<?>> list, List<? extends a.e<?>> list2) {
        l.d(list, "");
        l.d(list2, "");
        this.f20904b = list;
        this.f20905c = list2;
    }

    @Override // androidx.recyclerview.widget.j.a
    public final boolean b(int i2, int i3) {
        if (i2 == i3 && this.f20904b.get(i2).f20867a == this.f20905c.get(i3).f20867a) {
            return true;
        }
        return false;
    }

    private static boolean a(Rank rank, Rank rank2) {
        if (rank.getRank() != rank2.getRank() || !l.a((Object) rank.getUser().displayId, (Object) rank2.getUser().displayId) || !l.a((Object) rank.getScoreDescription(), (Object) rank2.getScoreDescription()) || !b(rank, rank2)) {
            return false;
        }
        return true;
    }

    private static boolean b(Rank rank, Rank rank2) {
        ImageModel avatarThumb = rank.getUser().getAvatarThumb();
        l.b(avatarThumb, "");
        String uri = avatarThumb.getUri();
        ImageModel avatarThumb2 = rank2.getUser().getAvatarThumb();
        l.b(avatarThumb2, "");
        if (!l.a((Object) uri, (Object) avatarThumb2.getUri()) || rank.getRoomId() != rank2.getRoomId()) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.j.a
    public final Object a(int i2, int i3) {
        T t = this.f20904b.get(i2).f20868b;
        T t2 = this.f20905c.get(i3).f20868b;
        if ((t instanceof Rank) && (t2 instanceof Rank) && b(t, t2)) {
            return "ket_not_change_avatar";
        }
        if ((t instanceof List) && (t2 instanceof List)) {
            T t3 = t;
            T t4 = t2;
            if (t3.size() == t4.size() && t3.size() > 0) {
                int size = t3.size();
                boolean z = true;
                for (int i4 = 0; i4 < size; i4++) {
                    if (z && (t3.get(i4) instanceof Rank) && (t4.get(i4) instanceof Rank)) {
                        Object obj = t3.get(i4);
                        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.bytedance.android.livesdk.rank.impl.api.model.Rank");
                        Object obj2 = t4.get(i4);
                        Objects.requireNonNull(obj2, "null cannot be cast to non-null type com.bytedance.android.livesdk.rank.impl.api.model.Rank");
                        if (b((Rank) obj, (Rank) obj2)) {
                            z = true;
                        }
                    }
                    z = false;
                }
                if (z) {
                    return "ket_not_change_avatar";
                }
            }
        }
        return super.a(i2, i3);
    }

    @Override // androidx.recyclerview.widget.j.a
    public final boolean c(int i2, int i3) {
        T t = this.f20904b.get(i2).f20868b;
        T t2 = this.f20905c.get(i3).f20868b;
        if ((t instanceof Rank) && (t2 instanceof Rank)) {
            return a(t, t2);
        }
        if ((t instanceof List) && (t2 instanceof List)) {
            T t3 = t;
            T t4 = t2;
            if (t3.size() == t4.size() && t3.size() > 0) {
                int size = t3.size();
                boolean z = true;
                for (int i4 = 0; i4 < size; i4++) {
                    if (z && (t3.get(i4) instanceof Rank) && (t4.get(i4) instanceof Rank)) {
                        Object obj = t3.get(i4);
                        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.bytedance.android.livesdk.rank.impl.api.model.Rank");
                        Object obj2 = t4.get(i4);
                        Objects.requireNonNull(obj2, "null cannot be cast to non-null type com.bytedance.android.livesdk.rank.impl.api.model.Rank");
                        if (a((Rank) obj, (Rank) obj2)) {
                            z = true;
                        }
                    }
                    z = false;
                }
                return z;
            } else if (!(t3.size() == t4.size() && t3.size() == 0)) {
                return false;
            }
        }
        return true;
    }
}
