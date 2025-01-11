package com.jinsub.exgeoquiz

import androidx.annotation.StringRes
/*
@StringRes 사용 이유
1. 생성자에서 유효한 문자열 리소스 ID를 제공하는지를 컴파일 시점에서 Lint 검사하기 위해
2. 애노테이션을 지정함으로써 다른 개발자가 쉽게 코드를 알 수 있다.
 */
data class Question(@StringRes val textResId: Int, val answer: Boolean)
