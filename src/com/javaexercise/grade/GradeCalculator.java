package com.javaexercise.grade;

/**
 * 5教科の成績判定機能を提供するクラス
 */
public class GradeCalculator {

    // 定数定義
    private static final int RED_POINT_THRESHOLD = 20; // 赤点の基準点
    private static final int GRADE_A_THRESHOLD = 450; // A判定の基準点
    private static final int GRADE_B_THRESHOLD = 400; // B判定の基準点
    private static final int GRADE_C_THRESHOLD = 300; // C判定の基準点
    private static final int GRADE_D_THRESHOLD = 200; // D判定の基準点
    private static final int MIN_SCORE = 0; // 最小点数
    private static final int MAX_SCORE = 100; // 最大点数

    // 各教科の点数をプロパティとして保持
    private int japanese; // 国語
    private int english; // 英語
    private int math; // 数学
    private int social; // 社会
    private int science; // 理科

    /**
     * コンストラクタ
     * 
     * @param japanese 国語の点数
     * @param english  英語の点数
     * @param math     数学の点数
     * @param social   社会の点数
     * @param science  理科の点数
     */
    public GradeCalculator(int japanese, int english, int math, int social, int science) {
        this.japanese = japanese;
        this.english = english;
        this.math = math;
        this.social = social;
        this.science = science;
    }

    /**
     * 5教科の点数から合計点を計算する
     * 
     * @return 合計点
     */
    public int calculateTotal() {
        return japanese + english + math + social + science;
    }

    /**
     * 5教科の点数から成績を判定する 赤点ルール：1科目でも20点未満があれば無条件でF 赤点がない場合は合計点で判定
     * 
     * @return 成績（Grade enum）
     */
    public Grade calculateGrade() {
        // 赤点チェック（1科目でも基準点未満があればF）
        if (japanese < RED_POINT_THRESHOLD || english < RED_POINT_THRESHOLD || math < RED_POINT_THRESHOLD
                || social < RED_POINT_THRESHOLD || science < RED_POINT_THRESHOLD) {
            return Grade.F;
        }

        // 合計点で判定
        int total = calculateTotal();

        if (total >= GRADE_A_THRESHOLD) {
            return Grade.A;
        } else if (total >= GRADE_B_THRESHOLD) {
            return Grade.B;
        } else if (total >= GRADE_C_THRESHOLD) {
            return Grade.C;
        } else if (total >= GRADE_D_THRESHOLD) {
            return Grade.D;
        } else {
            return Grade.F;
        }
    }

    /**
     * 点数が有効範囲内かチェックする
     * 
     * @param score 点数
     * @return 有効な場合true、無効な場合false
     */
    public boolean isValidScore(int score) {
        return score >= MIN_SCORE && score <= MAX_SCORE;
    }
}