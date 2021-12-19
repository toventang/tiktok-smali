package androidx.constraintlayout.a.a;

import androidx.constraintlayout.a.a.f;
import androidx.constraintlayout.a.e;
import com.bytedance.covode.number.Covode;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    static boolean[] f1953a = new boolean[3];

    static {
        Covode.recordClassIndex(595);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x003b A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(androidx.constraintlayout.a.a.f r4, int r5) {
        /*
            androidx.constraintlayout.a.a.f$a[] r0 = r4.G
            r1 = r0[r5]
            androidx.constraintlayout.a.a.f$a r0 = androidx.constraintlayout.a.a.f.a.MATCH_CONSTRAINT
            r3 = 0
            if (r1 == r0) goto L_0x000a
            return r3
        L_0x000a:
            float r2 = r4.K
            r0 = 0
            r1 = 1
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x001d
            androidx.constraintlayout.a.a.f$a[] r0 = r4.G
            if (r5 != 0) goto L_0x001b
        L_0x0016:
            r1 = r0[r1]
            androidx.constraintlayout.a.a.f$a r0 = androidx.constraintlayout.a.a.f.a.MATCH_CONSTRAINT
            return r3
        L_0x001b:
            r1 = 0
            goto L_0x0016
        L_0x001d:
            if (r5 != 0) goto L_0x002d
            int r0 = r4.f1927g
            if (r0 == 0) goto L_0x0024
            return r3
        L_0x0024:
            int r0 = r4.f1930j
            if (r0 != 0) goto L_0x002c
            int r0 = r4.f1931k
            if (r0 == 0) goto L_0x003b
        L_0x002c:
            return r3
        L_0x002d:
            int r0 = r4.f1928h
            if (r0 == 0) goto L_0x0032
            return r3
        L_0x0032:
            int r0 = r4.f1933m
            if (r0 != 0) goto L_0x003a
            int r0 = r4.n
            if (r0 == 0) goto L_0x003b
        L_0x003a:
            return r3
        L_0x003b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.a.a.k.a(androidx.constraintlayout.a.a.f, int):boolean");
    }

    static void a(int i2, f fVar) {
        boolean z;
        boolean z2;
        boolean z3;
        fVar.g();
        m mVar = fVar.w.f1909a;
        m mVar2 = fVar.x.f1909a;
        m mVar3 = fVar.y.f1909a;
        m mVar4 = fVar.z.f1909a;
        if ((i2 & 8) == 8) {
            z = true;
        } else {
            z = false;
        }
        if (fVar.G[0] != f.a.MATCH_CONSTRAINT || !a(fVar, 0)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!(mVar.f1960g == 4 || mVar3.f1960g == 4)) {
            if (fVar.G[0] != f.a.FIXED) {
                if (z2) {
                    if (fVar.ag != 8) {
                        int k2 = fVar.k();
                        mVar.f1960g = 1;
                        mVar3.f1960g = 1;
                        if (fVar.w.f1912d == null && fVar.y.f1912d == null) {
                            if (z) {
                                mVar3.a(mVar, 1, fVar.i());
                            } else {
                                mVar3.b(mVar, k2);
                            }
                        } else if (fVar.w.f1912d == null || fVar.y.f1912d != null) {
                            if (fVar.w.f1912d != null || fVar.y.f1912d == null) {
                                if (!(fVar.w.f1912d == null || fVar.y.f1912d == null)) {
                                    if (z) {
                                        fVar.i().a(mVar);
                                        fVar.i().a(mVar3);
                                    }
                                    if (fVar.K == 0.0f) {
                                        mVar.f1960g = 3;
                                        mVar3.f1960g = 3;
                                        mVar.b(mVar3, 0.0f);
                                        mVar3.b(mVar, 0.0f);
                                    } else {
                                        mVar.f1960g = 2;
                                        mVar3.f1960g = 2;
                                        mVar.b(mVar3, (float) (-k2));
                                        mVar3.b(mVar, (float) k2);
                                        fVar.c(k2);
                                    }
                                }
                            } else if (z) {
                                mVar.a(mVar3, -1, fVar.i());
                            } else {
                                mVar.b(mVar3, -k2);
                            }
                        } else if (z) {
                            mVar3.a(mVar, 1, fVar.i());
                        } else {
                            mVar3.b(mVar, k2);
                        }
                    }
                }
            }
            if (fVar.w.f1912d == null && fVar.y.f1912d == null) {
                mVar.f1960g = 1;
                mVar3.f1960g = 1;
                if (z) {
                    mVar3.a(mVar, 1, fVar.i());
                } else {
                    mVar3.b(mVar, fVar.k());
                }
            } else if (fVar.w.f1912d != null && fVar.y.f1912d == null) {
                mVar.f1960g = 1;
                mVar3.f1960g = 1;
                if (z) {
                    mVar3.a(mVar, 1, fVar.i());
                } else {
                    mVar3.b(mVar, fVar.k());
                }
            } else if (fVar.w.f1912d == null && fVar.y.f1912d != null) {
                mVar.f1960g = 1;
                mVar3.f1960g = 1;
                mVar.b(mVar3, -fVar.k());
                if (z) {
                    mVar.a(mVar3, -1, fVar.i());
                } else {
                    mVar.b(mVar3, -fVar.k());
                }
            } else if (!(fVar.w.f1912d == null || fVar.y.f1912d == null)) {
                mVar.f1960g = 2;
                mVar3.f1960g = 2;
                if (z) {
                    fVar.i().a(mVar);
                    fVar.i().a(mVar3);
                    mVar.b(mVar3, -1, fVar.i());
                    mVar3.b(mVar, 1, fVar.i());
                } else {
                    mVar.b(mVar3, (float) (-fVar.k()));
                    mVar3.b(mVar, (float) fVar.k());
                }
            }
        }
        if (fVar.G[1] != f.a.MATCH_CONSTRAINT || !a(fVar, 1)) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (mVar2.f1960g != 4 && mVar4.f1960g != 4) {
            if (fVar.G[1] != f.a.FIXED) {
                if (!z3) {
                    return;
                }
                if (fVar.ag != 8) {
                    int l2 = fVar.l();
                    mVar2.f1960g = 1;
                    mVar4.f1960g = 1;
                    if (fVar.x.f1912d == null && fVar.z.f1912d == null) {
                        if (z) {
                            mVar4.a(mVar2, 1, fVar.j());
                            return;
                        } else {
                            mVar4.b(mVar2, l2);
                            return;
                        }
                    } else if (fVar.x.f1912d == null || fVar.z.f1912d != null) {
                        if (fVar.x.f1912d != null || fVar.z.f1912d == null) {
                            if (fVar.x.f1912d != null && fVar.z.f1912d != null) {
                                if (z) {
                                    fVar.j().a(mVar2);
                                    fVar.i().a(mVar4);
                                }
                                if (fVar.K == 0.0f) {
                                    mVar2.f1960g = 3;
                                    mVar4.f1960g = 3;
                                    mVar2.b(mVar4, 0.0f);
                                    mVar4.b(mVar2, 0.0f);
                                    return;
                                }
                                mVar2.f1960g = 2;
                                mVar4.f1960g = 2;
                                mVar2.b(mVar4, (float) (-l2));
                                mVar4.b(mVar2, (float) l2);
                                fVar.d(l2);
                                if (fVar.W > 0) {
                                    fVar.A.f1909a.a(mVar2, fVar.W);
                                    return;
                                }
                                return;
                            }
                            return;
                        } else if (z) {
                            mVar2.a(mVar4, -1, fVar.j());
                            return;
                        } else {
                            mVar2.b(mVar4, -l2);
                            return;
                        }
                    } else if (z) {
                        mVar4.a(mVar2, 1, fVar.j());
                        return;
                    } else {
                        mVar4.b(mVar2, l2);
                        return;
                    }
                }
            }
            if (fVar.x.f1912d == null && fVar.z.f1912d == null) {
                mVar2.f1960g = 1;
                mVar4.f1960g = 1;
                if (z) {
                    mVar4.a(mVar2, 1, fVar.j());
                } else {
                    mVar4.b(mVar2, fVar.l());
                }
                if (fVar.A.f1912d != null) {
                    fVar.A.f1909a.f1960g = 1;
                    mVar2.a(fVar.A.f1909a, -fVar.W);
                }
            } else if (fVar.x.f1912d != null && fVar.z.f1912d == null) {
                mVar2.f1960g = 1;
                mVar4.f1960g = 1;
                if (z) {
                    mVar4.a(mVar2, 1, fVar.j());
                } else {
                    mVar4.b(mVar2, fVar.l());
                }
                if (fVar.W > 0) {
                    fVar.A.f1909a.a(mVar2, fVar.W);
                }
            } else if (fVar.x.f1912d == null && fVar.z.f1912d != null) {
                mVar2.f1960g = 1;
                mVar4.f1960g = 1;
                if (z) {
                    mVar2.a(mVar4, -1, fVar.j());
                } else {
                    mVar2.b(mVar4, -fVar.l());
                }
                if (fVar.W > 0) {
                    fVar.A.f1909a.a(mVar2, fVar.W);
                }
            } else if (fVar.x.f1912d != null && fVar.z.f1912d != null) {
                mVar2.f1960g = 2;
                mVar4.f1960g = 2;
                if (z) {
                    mVar2.b(mVar4, -1, fVar.j());
                    mVar4.b(mVar2, 1, fVar.j());
                    fVar.j().a(mVar2);
                    fVar.i().a(mVar4);
                } else {
                    mVar2.b(mVar4, (float) (-fVar.l()));
                    mVar4.b(mVar2, (float) fVar.l());
                }
                if (fVar.W > 0) {
                    fVar.A.f1909a.a(mVar2, fVar.W);
                }
            }
        }
    }

    static void a(f fVar, int i2, int i3) {
        int i4 = i2 * 2;
        int i5 = i4 + 1;
        fVar.E[i4].f1909a.f1958e = fVar.H.w.f1909a;
        fVar.E[i4].f1909a.f1959f = (float) i3;
        fVar.E[i4].f1909a.f1967i = 1;
        fVar.E[i5].f1909a.f1958e = fVar.E[i4].f1909a;
        fVar.E[i5].f1909a.f1959f = (float) fVar.b(i2);
        fVar.E[i5].f1909a.f1967i = 1;
    }

    static void a(g gVar, e eVar, f fVar) {
        if (gVar.G[0] != f.a.WRAP_CONTENT && fVar.G[0] == f.a.MATCH_PARENT) {
            int i2 = fVar.w.f1913e;
            int k2 = gVar.k() - fVar.y.f1913e;
            fVar.w.f1918j = eVar.a(fVar.w);
            fVar.y.f1918j = eVar.a(fVar.y);
            eVar.a(fVar.w.f1918j, i2);
            eVar.a(fVar.y.f1918j, k2);
            fVar.f1923c = 2;
            fVar.b(i2, k2);
        }
        if (gVar.G[1] != f.a.WRAP_CONTENT && fVar.G[1] == f.a.MATCH_PARENT) {
            int i3 = fVar.x.f1913e;
            int l2 = gVar.l() - fVar.z.f1913e;
            fVar.x.f1918j = eVar.a(fVar.x);
            fVar.z.f1918j = eVar.a(fVar.z);
            eVar.a(fVar.x.f1918j, i3);
            eVar.a(fVar.z.f1918j, l2);
            if (fVar.W > 0 || fVar.ag == 8) {
                fVar.A.f1918j = eVar.a(fVar.A);
                eVar.a(fVar.A.f1918j, fVar.W + i3);
            }
            fVar.f1924d = 2;
            fVar.c(i3, l2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0100, code lost:
        if (r6.ap == 2) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x010a, code lost:
        r19 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        if (r6.ao == 2) goto L_0x0024;
     */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x00a3 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean a(androidx.constraintlayout.a.e r22, int r23, int r24, androidx.constraintlayout.a.a.d r25) {
        /*
        // Method dump skipped, instructions count: 823
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.a.a.k.a(androidx.constraintlayout.a.e, int, int, androidx.constraintlayout.a.a.d):boolean");
    }
}
