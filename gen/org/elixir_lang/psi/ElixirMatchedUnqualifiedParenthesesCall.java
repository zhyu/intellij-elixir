// This is a generated file. Not intended for manual editing.
package org.elixir_lang.psi;

import com.ericsson.otp.erlang.OtpErlangObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface ElixirMatchedUnqualifiedParenthesesCall extends ElixirMatchedExpression, MatchedCall, UnqualifiedParenthesesCall {

  @NotNull
  ElixirMatchedParenthesesArguments getMatchedParenthesesArguments();

  @Nullable
  ElixirDoBlock getDoBlock();

  @NotNull
  OtpErlangObject quote();

}
