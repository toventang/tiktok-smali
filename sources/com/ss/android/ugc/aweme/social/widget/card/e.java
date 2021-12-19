package com.ss.android.ugc.aweme.social.widget.card;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.friends.d;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.social.widget.card.a.f;
import com.ss.android.ugc.aweme.social.widget.card.a.h;
import com.ss.android.ugc.aweme.social.widget.card.permission.ContactLargeSquareCell;
import com.ss.android.ugc.aweme.social.widget.card.permission.ContactRectangleCell;
import com.ss.android.ugc.aweme.social.widget.card.permission.ContactSquareCell;
import com.ss.android.ugc.aweme.social.widget.card.permission.FacebookLargeSquareCell;
import com.ss.android.ugc.aweme.social.widget.card.permission.FacebookRectangleCell;
import com.ss.android.ugc.aweme.social.widget.card.permission.FacebookSquareCell;
import com.ss.android.ugc.aweme.social.widget.card.permission.PermissionCell;
import com.ss.android.ugc.aweme.social.widget.card.permission.c;
import com.ss.android.ugc.aweme.social.widget.card.rec.cell.RecUserRectangleCell;
import com.ss.android.ugc.aweme.social.widget.card.rec.cell.RecUserSquareCell;
import com.ss.android.ugc.aweme.social.widget.card.rec.cell.RecommendUserCell;
import com.ss.android.ugc.aweme.ufr.a;
import com.ss.android.ugc.aweme.utils.in;
import h.f.b.l;
import h.n;
import java.util.Locale;
import java.util.Objects;

public final class e {
    static {
        Covode.recordClassIndex(87514);
    }

    public static final String c(f fVar) {
        l.d(fVar, "");
        if (b(fVar)) {
            return "on";
        }
        return "off";
    }

    public static final Class<? extends a> a(f fVar) {
        l.d(fVar, "");
        int i2 = f.f133788a[fVar.ordinal()];
        if (i2 == 1) {
            return com.ss.android.ugc.aweme.friends.service.a.f97047a.f();
        }
        if (i2 == 2) {
            return com.ss.android.ugc.aweme.friends.service.a.f97047a.c();
        }
        throw new n();
    }

    public static final boolean b(f fVar) {
        l.d(fVar, "");
        int i2 = f.f133789b[fVar.ordinal()];
        if (i2 == 1) {
            return com.ss.android.ugc.aweme.friends.service.a.f97047a.g().b();
        }
        if (i2 == 2) {
            return com.ss.android.ugc.aweme.friends.service.a.f97047a.d().c();
        }
        throw new n();
    }

    public static final String d(f fVar) {
        l.d(fVar, "");
        int i2 = f.f133792e[fVar.ordinal()];
        if (i2 == 1) {
            d g2 = com.ss.android.ugc.aweme.friends.service.a.f97047a.g();
            User c2 = in.c();
            l.b(c2, "");
            if (g2.a(c2.getUid()).length() > 0) {
                return "on";
            }
            return "off";
        } else if (i2 == 2) {
            boolean b2 = com.ss.android.ugc.aweme.friends.service.a.f97047a.d().b();
            boolean a2 = com.bytedance.ies.powerpermissions.b.a.a("android.permission.READ_CONTACTS");
            if (b2) {
                return "on";
            }
            if (a2) {
                return "off";
            }
            return "unknown";
        } else {
            throw new n();
        }
    }

    public static final String e(f fVar) {
        l.d(fVar, "");
        int i2 = f.f133793f[fVar.ordinal()];
        if (i2 == 1) {
            String name = fVar.name();
            Locale locale = Locale.ENGLISH;
            l.b(locale, "");
            Objects.requireNonNull(name, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = name.toLowerCase(locale);
            l.b(lowerCase, "");
            return lowerCase;
        } else if (i2 == 2) {
            String name2 = fVar.name();
            Locale locale2 = Locale.ENGLISH;
            l.b(locale2, "");
            Objects.requireNonNull(name2, "null cannot be cast to non-null type java.lang.String");
            String lowerCase2 = name2.toLowerCase(locale2);
            l.b(lowerCase2, "");
            return lowerCase2;
        } else {
            throw new n();
        }
    }

    public static final Class<? extends RecommendUserCell<com.ss.android.ugc.aweme.social.widget.card.rec.cell.a>> a(h hVar) {
        l.d(hVar, "");
        int i2 = f.f133798k[hVar.f133746a.ordinal()];
        if (i2 == 1) {
            return RecUserSquareCell.class;
        }
        if (i2 == 2) {
            return RecUserRectangleCell.class;
        }
        throw new IllegalArgumentException("current is not support large square!");
    }

    public static final Class<? extends PermissionCell<? extends c>> a(f fVar, com.ss.android.ugc.aweme.social.widget.card.a.a aVar) {
        l.d(fVar, "");
        l.d(aVar, "");
        int i2 = f.f133797j[aVar.ordinal()];
        if (i2 == 1) {
            int i3 = f.f133794g[fVar.ordinal()];
            if (i3 == 1) {
                return FacebookRectangleCell.class;
            }
            if (i3 == 2) {
                return ContactRectangleCell.class;
            }
            throw new n();
        } else if (i2 == 2) {
            int i4 = f.f133795h[fVar.ordinal()];
            if (i4 == 1) {
                return FacebookSquareCell.class;
            }
            if (i4 == 2) {
                return ContactSquareCell.class;
            }
            throw new n();
        } else if (i2 == 3) {
            int i5 = f.f133796i[fVar.ordinal()];
            if (i5 == 1) {
                return FacebookLargeSquareCell.class;
            }
            if (i5 == 2) {
                return ContactLargeSquareCell.class;
            }
            throw new n();
        } else {
            throw new n();
        }
    }
}
