package co.speechpal.server.bot.services.grammar

import arrow.core.Either
import co.speechpal.server.bot.models.domain.Context
import co.speechpal.server.bot.models.dto.BotError
import co.speechpal.server.common.models.domain.TextCheckResult

interface GrammarCheckerService {
    suspend fun checkGrammar(context: Context, text: String): Either<BotError, TextCheckResult>
}