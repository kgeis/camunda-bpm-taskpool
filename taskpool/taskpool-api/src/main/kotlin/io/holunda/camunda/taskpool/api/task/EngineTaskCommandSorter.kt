package io.holunda.camunda.taskpool.api.task

// defines a partial order on EngineTaskCommand
const val ORDER_TASK_CREATION = Int.MIN_VALUE
const val ORDER_TASK_DELETION = Int.MAX_VALUE
const val ORDER_TASK_COMPLETION = ORDER_TASK_DELETION - 1
const val ORDER_TASK_ASSIGNMENT = 0
const val ORDER_TASK_CANDIDATES_UPDATE = 1
const val ORDER_TASK_ATTRIBUTE_UPDATE = 2


/**
 * Provides an ordering for EngineTaskCommand based on their order property.
 */
class EngineTaskCommandSorter : Comparator<EngineTaskCommand> {

  override fun compare(command: EngineTaskCommand, otherCommand: EngineTaskCommand): Int {

    // EngineTaskCommand with lower order value comes first
    return Integer.compare(command.order, otherCommand.order)
  }
}
