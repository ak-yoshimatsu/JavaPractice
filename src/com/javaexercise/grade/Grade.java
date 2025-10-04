package com.javaexercise.grade;

/**
 * 成績を表すenumクラス
 */
public enum Grade {
    A("A"), B("B"), C("C"), D("D"), F("F");

    private final String code;

    /**
     * コンストラクタ
     * 
     * @param code 成績コード
     */
    Grade(String code) {
        this.code = code;
    }

    /**
     * 成績コードを取得する
     * 
     * @return 成績コード
     */
    public String getCode() {
        return code;
    }

    @Override
    public String toString() {
        return code;
    }
}